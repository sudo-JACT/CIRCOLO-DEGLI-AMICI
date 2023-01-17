public class Socio {

    protected static int noft=0;
    protected final String name;
    protected final String surname;
    protected final int tessera;


    public Socio(String n, String s){

        this.name = n;
        this.surname = s;
        this.tessera = Socio.noft;
        Socio.noft++;

    }


    public String getName(){

        return this.name;

    }

    public String getSurname(){

        return this.surname;

    }

    public int getTessera(){

        return this.tessera;

    }


    @Override
    public boolean equals(Object obj) {
       
        if(obj == null || !(obj instanceof Socio)){

            return false;

        }else{

            Socio s = (Socio) obj;

            if(this.name.equalsIgnoreCase(s.getName()) && this.surname.equalsIgnoreCase(s.getSurname()) && this.tessera == s.getTessera()){

                return true;

            }else{

                return false;

            }

        }

    }

    @Override
    public String toString() {
       
        return this.name + " " + this.surname;

    }


}
