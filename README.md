# Wistron OpenBMC


## Setting up your OpenBMC project

### 1) Prerequisite
- Ubuntu 14.04

```
sudo apt-get install -y git build-essential libsdl1.2-dev texinfo gawk chrpath diffstat
```

- Fedora 28

```
sudo dnf install -y git patch diffstat texinfo chrpath SDL-devel bitbake \
    rpcgen perl-Thread-Queue perl-bignum perl-Crypt-OpenSSL-Bignum
sudo dnf groupinstall "C Development Tools and Libraries"
```
### 2) Download the source
```
git clone -b Wistron-OP940 https://github.com/wistron-corporation/openbmc-1.git
cd openbmc
```

### 3) Target your hardware

Machine | TEMPLATECONF
--------|---------
Palmetto | ```meta-ibm/meta-palmetto/conf```
Zaius| ```meta-ingrasys/meta-zaius/conf```
Witherspoon| ```meta-ibm/meta-witherspoon/conf```
Romulus| ```meta-ibm/meta-romulus/conf```


As an example target mihawk
```
TEMPLATECONF=meta-ibm/meta-witherspoon/conf . openbmc-env
export MACHINE=mihawk
```

### 4) Build

```
bitbake obmc-phosphor-image
```