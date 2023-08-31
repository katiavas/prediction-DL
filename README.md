# Gravitational mechanichs prediction and simulation with machine learning

Explored the use of deep learning simulators to approximate gravitational dynamics.
1. Point Prediction: Investigated the prediction of terminal positions based on initial data, 
potentially replacing iterative physics-based solvers. The dynamics were simulated with a graph neural network.
2. Simulation: Built a model to generate full simulations of the system, predicting sequences 
of positions up to the terminal state.: This was done using an RNN to take into consideration the
time steps and the relation between each time step.
3. Used torch.geometric for data preprocessing
