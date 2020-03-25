add_executable (helloWorldC_cmake helloWorldC.c) 

install(PROGRAMS ${CMAKE_CURRENT_BINARY_DIR}/helloWorldC_cmake
  DESTINATION bin)
