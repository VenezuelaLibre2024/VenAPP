.class final enum Lcom/it_nomads/fluttersecurestorage/ciphers/d;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/it_nomads/fluttersecurestorage/ciphers/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/it_nomads/fluttersecurestorage/ciphers/d;

.field public static final enum RSA_ECB_OAEPwithSHA_256andMGF1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

.field public static final enum RSA_ECB_PKCS1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;


# instance fields
.field final keyCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/e;

.field final minVersionCode:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    new-instance v1, Lcom/it_nomads/fluttersecurestorage/ciphers/b;

    invoke-direct {v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/b;-><init>()V

    const-string v2, "RSA_ECB_PKCS1Padding"

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-direct {v0, v2, v3, v1, v4}, Lcom/it_nomads/fluttersecurestorage/ciphers/d;-><init>(Ljava/lang/String;ILcom/it_nomads/fluttersecurestorage/ciphers/e;I)V

    sput-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->RSA_ECB_PKCS1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    new-instance v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    new-instance v1, Lcom/it_nomads/fluttersecurestorage/ciphers/c;

    invoke-direct {v1}, Lcom/it_nomads/fluttersecurestorage/ciphers/c;-><init>()V

    const/16 v2, 0x17

    const-string v3, "RSA_ECB_OAEPwithSHA_256andMGF1Padding"

    invoke-direct {v0, v3, v4, v1, v2}, Lcom/it_nomads/fluttersecurestorage/ciphers/d;-><init>(Ljava/lang/String;ILcom/it_nomads/fluttersecurestorage/ciphers/e;I)V

    sput-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->RSA_ECB_OAEPwithSHA_256andMGF1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    invoke-static {}, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->b()[Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    move-result-object v0

    sput-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->$VALUES:[Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILcom/it_nomads/fluttersecurestorage/ciphers/e;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/it_nomads/fluttersecurestorage/ciphers/e;",
            "I)V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->keyCipher:Lcom/it_nomads/fluttersecurestorage/ciphers/e;

    iput p4, p0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->minVersionCode:I

    return-void
.end method

.method private static synthetic b()[Lcom/it_nomads/fluttersecurestorage/ciphers/d;
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    const/4 v1, 0x0

    sget-object v2, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->RSA_ECB_PKCS1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->RSA_ECB_OAEPwithSHA_256andMGF1Padding:Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    aput-object v2, v0, v1

    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/it_nomads/fluttersecurestorage/ciphers/d;
    .locals 1

    const-class v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    return-object p0
.end method

.method public static values()[Lcom/it_nomads/fluttersecurestorage/ciphers/d;
    .locals 1

    sget-object v0, Lcom/it_nomads/fluttersecurestorage/ciphers/d;->$VALUES:[Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    invoke-virtual {v0}, [Lcom/it_nomads/fluttersecurestorage/ciphers/d;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/it_nomads/fluttersecurestorage/ciphers/d;

    return-object v0
.end method
