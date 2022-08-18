public class kniffel
{
    public wuerfel[] w;
    public kniffel()
    {
        w = new wuerfel[5];
        w[0] = new wuerfel(6);
        w[1] = new wuerfel(6);
        w[2] = new wuerfel(6);
        w[3] = new wuerfel(6);
        w[4] = new wuerfel(6);
    }

    public void spielzug()
    {
        for(int i = 0; i < 5;i++){
            w[i].wuerfeln();
        }
        // alle 5 würfeln
        for(int i = 0; i < 5; i++){
            System.out.println("Dein " + (i+1) + ". Würfel zeigt: " + w[i].getAZ());
        }
    }

    public void kombocheck(){
    }

    public void spiel()
    {

    }
}