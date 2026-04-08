public class Convertidor {

    public static void convertiddor (int[][] array,Mapa mapa) {

        if(array.length!=mapa.getPixel().length) {
System.out.println("Error: Las dimensiones del array y el mapa no coinciden.");
        }
        else{

for(int i=0;i<mapa.getPixel().length;i++ ) {

for(int j=0;j<mapa.getPixel()[i].length;j++ ) {

switch (array[i][j]) {

case 0:
mapa.anadirHueco(new Libre(),i,j);
break;

case 1:
mapa.anadirHueco(new Pared(),i,j);
break;

case 2:
mapa.anadirHueco(new Salto(),i,j);
break;

case 3:
mapa.anadirHueco(new Arbusto(),i,j);
break;

default:


}

}

}
        }

    }
    
}
