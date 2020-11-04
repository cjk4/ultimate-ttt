import random
from collections import defaultdict
from abc import ABC, abstractmethod

#class game tree with monte carlo search
#contains tree of each possible game state

class monte_carlo:
    def __init__(self, weight, value):
        self.policy = defaultdict(int) #value of the node
        self.weight = weight #xi(mean value of node) +- ((2lnn)/ni)**0.5 (n = total nodes explored, 
        #ni = #simulations for child node i)
        #(node to explore next) 
        self.visit_count = defaultdict(int) #n
        self.children = []    
        
    def make_move(self):
        node_to_choose = max([self.children[value] for child in self.children])
        
        if not node_to_choose:
            return self.children[random.randint(0, len(self.children))]
        return node_to_choose
        
