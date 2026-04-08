public class Party {

    public static  Personaje [] team;
    private static int tamanioActual;

    public Party() {
        this.tamanioActual=0;
        team= new Personaje [4];
    }


    
    
    
    public boolean anadirPj(Personaje p) {

        if (p.getElegido()) {

            System.out.println("Pj ya seleccionado");
            return false;
        }

        for (int i = 0; i < 4; i++) {
            if (team[i] == null) {
                p.setElegido(true);

                team[i] = p;
                
                this.tamanioActual++;
                return true;
            }

        }
        return false;
    }
    
    public boolean quitarPj(String idBuscado) {
    
    if(this.tamanioActual==1) { System.out.println("Debe haber al menos 1 personaje en el equipo");return false;}
    
    for(int i=0;i<4;i++) {
    if(team[i]!=null) {
    if(team[i].getId().equals(idBuscado)) {
    team[i].setElegido(false);
    team[i]=null;
    tamanioActual--;
    return true;
    }
    }
    }
    System.out.println("Personaje no encontrado en el equipo");
    return false;
    }



    public static Personaje[] getTeam() {
        return team;
    }



    public static int getTamanioActual() {
        return tamanioActual;
    }

    
}
