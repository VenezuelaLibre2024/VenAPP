.class public final enum Lcom/google/crypto/tink/shaded/protobuf/b1;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/crypto/tink/shaded/protobuf/b1;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/crypto/tink/shaded/protobuf/b1;

.field public static final enum PROTO2:Lcom/google/crypto/tink/shaded/protobuf/b1;

.field public static final enum PROTO3:Lcom/google/crypto/tink/shaded/protobuf/b1;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/b1;

    const-string v1, "PROTO2"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/b1;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/b1;->PROTO2:Lcom/google/crypto/tink/shaded/protobuf/b1;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/b1;

    const-string v3, "PROTO3"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/b1;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/crypto/tink/shaded/protobuf/b1;->PROTO3:Lcom/google/crypto/tink/shaded/protobuf/b1;

    const/4 v3, 0x2

    new-array v3, v3, [Lcom/google/crypto/tink/shaded/protobuf/b1;

    aput-object v0, v3, v2

    aput-object v1, v3, v4

    sput-object v3, Lcom/google/crypto/tink/shaded/protobuf/b1;->$VALUES:[Lcom/google/crypto/tink/shaded/protobuf/b1;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/b1;
    .locals 1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/b1;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/b1;

    return-object p0
.end method

.method public static values()[Lcom/google/crypto/tink/shaded/protobuf/b1;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/b1;->$VALUES:[Lcom/google/crypto/tink/shaded/protobuf/b1;

    invoke-virtual {v0}, [Lcom/google/crypto/tink/shaded/protobuf/b1;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/crypto/tink/shaded/protobuf/b1;

    return-object v0
.end method
