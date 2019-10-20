package com.elfinlas.etc;

/**
 * Stack 관련
 *
 * Created by MHLab on 2019/10/20..
 */

public class Stack {

    public void testStack() {
        ArrayStack arrayStack = new ArrayStack(5);
        arrayStack.push(10);
        arrayStack.push(20);
        arrayStack.push(30);
        System.out.println("peek = " + arrayStack.peek());
        arrayStack.push(40);
        System.out.println("pop = " + arrayStack.pop());
        arrayStack.showStack();
    }

    //Array로 구현한 Stack
    class ArrayStack {
        private int maxSize;
        private Object[] stackArray;
        private int top;

        /**
         * Default Construct
         * @param maxSize
         */
        public ArrayStack(int maxSize) {
            this.maxSize = maxSize;
            this.stackArray = new Object[this.maxSize];
            this.top = -1;
        }

        /**
         * 데이터 추가
         * @param object
         */
        void push(Object object) {
            if (full()) { throw new ArrayIndexOutOfBoundsException("Stack is full."); }
            this.stackArray[++top] = object;
        }

        /**
         * 맨 위 데이터 출력 후 삭제
         * @return
         */
        Object pop() {
            Object item = peek();
            this.stackArray[top] = null;
            top--;
            return item;
        }

        /**
         * 맨 위 데이터 확인
         * @return
         */
        Object peek() {
            if (empty()) { throw new ArrayIndexOutOfBoundsException("Stack is empty."); }
            return this.stackArray[top];
        }

        boolean full() {
            return (this.maxSize -1 == top);
        }

        boolean empty() {
            return (top == -1);
        }

        void showStack() {
            if (empty()) {
                System.out.println("Stack is empty");
            }
            else {
                for (int i=0; i<this.maxSize-1; i++) {
                    Object value = this.stackArray[i];
                    if (value != null) {
                        System.out.println("top = " + i + " value = " + value);
                    }
                    else { break; }
                }
            }
        }
    }

}
