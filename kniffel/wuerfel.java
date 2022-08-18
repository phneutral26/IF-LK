public class wuerfel
{
    private int anzahlSeiten;
    private int aktuelleZahl;
    /**
     * Setzt die anzahl der Seiten, per Parameter bestimmt
     */
    public wuerfel(int anzahlSeiten)
    {
        this.anzahlSeiten = anzahlSeiten;
    }
    public void setAS(int AS){
        anzahlSeiten = AS;
    }
    public void setAZ(int AZ){
        aktuelleZahl = AZ;
    }
    public int getAS(){
        return this.anzahlSeiten;
    }
    public int getAZ(){
        return this.aktuelleZahl;
    }
    /**
     * Generiert eine zufaellige Zahl zwischen 1 und 6, speichert diese in einem Attribut
     * und wird dann ausgegeben.
     */
    public int wuerfeln(){
        aktuelleZahl = (int)(Math.random() * anzahlSeiten + 1);
        return aktuelleZahl;
    }
}
