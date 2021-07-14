package com.example.calculator;

public class Stack {


        private int MaxSize;// Define the maximum length of an array
        private int[] arr;// Define an array, where the data is placed
        private int top = -1;// Define the top of the stack and initialize the data to -1

        public Stack(int maxSize) {
            this.MaxSize = maxSize;
            arr = new int[MaxSize];
        }

        // Determine whether an array is empty
        public boolean isEmpty() {

            return top == -1;
        }

        // Determine whether the array is full
        public boolean isFull() {
            //System.out.println("stack top:"+top+maximum length:"+MaxSize);
            return top == MaxSize - 1;
        }

        //Remove the top element of the stack
        public int peek() {
            return arr[top];
        }

        // Enter stack
        public void push(int val) {
            // First judge whether the stack is full or not. If it is full, it cannot be added.
            if (isFull()) {
                System.out.println("The stack is full.~~");
                return;
            }
            top++;
            arr[top] = val;
        }

        // Stack out
        public int pop() {
            // First determine whether the stack is empty
            if (isEmpty()) {
                throw new RuntimeException("The stack is empty and can't get out of the stack!");
            }
            int val = arr[top];
            top--;
            return val;
        }

        public void show() {
            if (isEmpty()) {
                System.out.println("no data");
                return;
            }
            for (int i = top; i >= 0; i--) {
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }

        /**
         * Determine whether it is an operator
         *
         * @param oper Incoming characters
         * @return If the operator returns true, otherwise it returns false
         */
        public boolean isOper(char oper) {
            return oper == '+' || oper == '-' || oper == '*' || oper == '/';
        }

        /**
         * Judging the priority of operators
         *
         * @param oper Priority of incoming
         * @return The return priority is 1, -1, 0, respectively.
         */
        public int priority(int oper) {
            if (oper == '*' || oper == '/') {
                return 1;
            } else if (oper == '+' || oper == '-') {
                return 0;
            } else {
                return -1;
            }
        }

        //computing method
        public int cal(int num1, int num2, int oper) {
            int res = 0;
            switch (oper) {
                case '+':
                    res = num1 + num2;
                    break;
                case '-':
                    res = num2 - num1;
                    break;
                case '*':
                    res = num1 * num2;
                    break;
                case '/':
                    res = num2 / num1;
            }
            return res;
        }
    }

