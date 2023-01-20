import os


def make(path, type, exp):
    
    files = os.listdir(path)
    
    for file in files:
        
        if file.endswith(type) and file != exp:
            
            os.system(f"javac -d . {file}")
            
            
            
if __name__ == "__main__":
    
    path = "./"
    type = ".java"
    exp = "App.java"
    
    make(path, type, exp)
    print("DONE...")