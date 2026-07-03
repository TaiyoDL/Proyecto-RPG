public class Nivel {


    public static void CalcularExpParaSiguienteNivel(Personaje p) {

p.setMexp(p.getLvl()*p.getLvl()*40+50);


    }

    public static void subirStats(Personaje p) {

p.setDefensaTotal(p.getDefensaTotal()+(int)(p.getDefensaTotal()*0.05));
p.setAtaqueTotal(p.getAtaqueTotal()+(int)(p.getAtaqueTotal()*0.05));
p.setVelocidadTotal(p.getVelocidadTotal()+(int)(p.getVelocidadTotal()*0.05));
p.setVidaTotal(p.getVidaTotal()+(int)(p.getVidaTotal()*0.08));

    }


    public static void SubirNivel(Personaje p) {

while(p.getExp()>=p.getMexp() && p.getLvl()<50) {

p.setLvl(p.getLvl()+1);
subirStats(p);
System.out.println(p.getNombre()+" ha subido a nivel "+p.getLvl()+"!");
p.setExp(p.getExp()-p.getMexp());
CalcularExpParaSiguienteNivel(p);


}

if (p.getLvl()>=50) {

p.setMexp(0);
p.setExp(0);

}


    }

    public static void RestaurarStats() {

for(Personaje p : Party.getTeam()) {
if(p!=null) {
p.setAtaque(p.getAtaqueTotal());
p.setDefensa(p.getDefensaTotal());
p.setVelocidad(p.getVelocidadTotal());
}
}
    }

    public static void SubirEquipo(){

for(int i=0;i<Party.getTeam().length;i++) {

    if(Party.getTeam()[i]!=null) {
SubirNivel(Party.getTeam()[i]);
    }


}

    }

    public static void RepartirExp(int experiencia) {

experiencia/=Party.getTamanioActual();

for(int i=0;i<4;i++) {

if(Party.getTeam()[i]!=null) {

Party.getTeam()[i].setExp(Party.getTeam()[i].getExp()+experiencia);

}

}

    }
    
}
