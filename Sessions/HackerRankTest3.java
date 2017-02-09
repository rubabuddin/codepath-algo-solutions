// BST implementation

/*
 * Complete the function below.
 */
    public static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data = data;
            left = null;
            right = null;
       }
    }

    public static Node root = null;
    public static int counter = 0;

    static void createBST(int[] keys) {
        for(int key : keys){
            Node newNode = new Node(key);
            if(root == null){
                root = newNode;

            } else {
                insert(root, newNode);
                       //I am not sure what this question is asking beyond the bst implementation
            }
            System.out.println(counter);
        }
    }

    static void insert(Node root, Node toInsert){

        Node current = root;
        Node parent = null;
        while(1 == 1){
            counter++;
            parent = current;
            if(toInsert.data < current.data){
                current = current.left;
                if(current == null){
                    parent.left = toInsert;
                    return;
                }
            } else {
                current = current.right;
                if(current == null){
                    parent.right = toInsert;
                    return;
                }
            }
        }
    }
