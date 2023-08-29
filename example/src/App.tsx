import * as React from 'react';

import { Button, StyleSheet, View } from 'react-native';
import { VisaView } from 'react-native-visa';

export default function App() {
  const ref = React.useRef<any>();

  const startAnimation = () => {
    ref.current.startAnimation();
  };

  return (
    <View style={styles.container}>
      <VisaView style={styles.box} backdropColor={'#ffffff'} ref={ref} />
      <Button title={'Start'} onPress={startAnimation} />
    </View>
  );
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    alignItems: 'center',
    justifyContent: 'center',
  },
  box: {
    width: 60,
    height: 60,
    marginVertical: 20,
  },
});
