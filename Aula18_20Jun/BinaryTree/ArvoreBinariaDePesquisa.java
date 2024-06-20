/**
 * ArvoreBinariaDePesquisa
 */
public class ArvoreBinariaDePesquisa {

    private class Nodo{
        public int valor;
        public Nodo pai, esquerda, direita;
        public Nodo(int v){
            valor=v;
            pai=esquerda=direita=null;
        }
    }

    private Nodo raiz;
    private int nElementos;

    public ArvoreBinariaDePesquisa(){
        raiz=null;
        nElementos=0;
    }

    public boolean isEmpty(){
        return (nElementos==0);
    }
    public int size(){
        return nElementos;
    }
    public void clear(){
        raiz=null;
        nElementos=0;
    }
    public int getRoot(){
        if(raiz==null)
            throw new RuntimeException("A árvore está vazia");
        return raiz.valor;
    }

    public void add(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        if(e==null)
            throw new IllegalArgumentException("O argumento não pode ser nulo");
        
        if(raiz==null)
            raiz=new Nodo(e);
        else
            internalAdd(raiz, e);
        nElementos++;
    }

    private void internalAdd(Nodo ref, int e){
        if(ref.valor>=e){
            if(ref.esquerda==null){
                Nodo aux = new Nodo(e);
                ref.esquerda=aux;
                aux.pai=ref;
            }
            else
                internalAdd(ref.esquerda, e);
        }
        else{
            if(ref.direita==null){
                Nodo aux = new Nodo(e);
                ref.direita=aux;
                aux.pai=ref;
            }
            else
                internalAdd(ref.direita, e);
        }
    }

    private void nodeLink(Nodo ref, StringBuffer t){
        if(ref!=null){
            if(ref.esquerda!=null)  t.append("  "+ ref.valor +" -> "+ ref.esquerda.valor+";\n");
            if(ref.direita!=null)   t.append("  "+ ref.valor +" -> "+ ref.direita.valor+";\n");

            nodeLink(ref.esquerda, t);
            nodeLink(ref.direita, t);
        }
    }

    public String toString(){
        StringBuffer sb = new StringBuffer();
        sb.append("DiGraph G{\n");
        nodeLink(raiz, sb);
        sb.append("}\n");
        return sb.toString();
    }

    public boolean remove(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return false;
    }
    public int getLeft(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return 0;
    }
    public int getRight(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return 0;
    }
    public int getParent(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return 0;
    }
    public int[] positionsPre(){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return null;
    }
    public int[] positionsCentral(){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return null;
    }
    public int [] positionsPos(){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return null;
    }
    public int[] positionsWidth(){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return null;
    }
    public int level(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return 0;
    }
    private Nodo findNodo(Nodo ref, int e){
        if(ref==null) return null;
        
        if(ref.valor==e) return ref;
        
        if(ref.valor>e)
            return findNodo(ref.esquerda, e);
        else
            return findNodo(ref.direita, e);
    }

    public boolean contains(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        if(e==null)
            throw new IllegalArgumentException("O parametro não pode ser nulo");

        Nodo aux = findNodo(raiz, e);
        if(aux!=null)
            System.out.println("Encontrou");
        else
            System.out.println("Não encontrou");

        return (aux!=null);
    }
    public int height(){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return 0;
    }
    public boolean isInternal(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return false;
    }
    public boolean isExternal(Integer e){
        //PRECISA DE SUBSIDIO PARA IMPLEMENTACAO
        return false;
    }
    
}