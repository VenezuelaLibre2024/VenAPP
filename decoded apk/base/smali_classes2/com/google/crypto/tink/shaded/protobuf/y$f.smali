.class public final enum Lcom/google/crypto/tink/shaded/protobuf/y$f;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/crypto/tink/shaded/protobuf/y;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "f"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/google/crypto/tink/shaded/protobuf/y$f;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum BUILD_MESSAGE_INFO:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum GET_DEFAULT_INSTANCE:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum GET_MEMOIZED_IS_INITIALIZED:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum GET_PARSER:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum NEW_BUILDER:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum NEW_MUTABLE_INSTANCE:Lcom/google/crypto/tink/shaded/protobuf/y$f;

.field public static final enum SET_MEMOIZED_IS_INITIALIZED:Lcom/google/crypto/tink/shaded/protobuf/y$f;


# direct methods
.method static constructor <clinit>()V
    .locals 15

    new-instance v0, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v1, "GET_MEMOIZED_IS_INITIALIZED"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/google/crypto/tink/shaded/protobuf/y$f;->GET_MEMOIZED_IS_INITIALIZED:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v1, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v3, "SET_MEMOIZED_IS_INITIALIZED"

    const/4 v4, 0x1

    invoke-direct {v1, v3, v4}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/google/crypto/tink/shaded/protobuf/y$f;->SET_MEMOIZED_IS_INITIALIZED:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v3, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v5, "BUILD_MESSAGE_INFO"

    const/4 v6, 0x2

    invoke-direct {v3, v5, v6}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v3, Lcom/google/crypto/tink/shaded/protobuf/y$f;->BUILD_MESSAGE_INFO:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v5, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v7, "NEW_MUTABLE_INSTANCE"

    const/4 v8, 0x3

    invoke-direct {v5, v7, v8}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v5, Lcom/google/crypto/tink/shaded/protobuf/y$f;->NEW_MUTABLE_INSTANCE:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v7, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v9, "NEW_BUILDER"

    const/4 v10, 0x4

    invoke-direct {v7, v9, v10}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v7, Lcom/google/crypto/tink/shaded/protobuf/y$f;->NEW_BUILDER:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v9, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v11, "GET_DEFAULT_INSTANCE"

    const/4 v12, 0x5

    invoke-direct {v9, v11, v12}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v9, Lcom/google/crypto/tink/shaded/protobuf/y$f;->GET_DEFAULT_INSTANCE:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    new-instance v11, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const-string v13, "GET_PARSER"

    const/4 v14, 0x6

    invoke-direct {v11, v13, v14}, Lcom/google/crypto/tink/shaded/protobuf/y$f;-><init>(Ljava/lang/String;I)V

    sput-object v11, Lcom/google/crypto/tink/shaded/protobuf/y$f;->GET_PARSER:Lcom/google/crypto/tink/shaded/protobuf/y$f;

    const/4 v13, 0x7

    new-array v13, v13, [Lcom/google/crypto/tink/shaded/protobuf/y$f;

    aput-object v0, v13, v2

    aput-object v1, v13, v4

    aput-object v3, v13, v6

    aput-object v5, v13, v8

    aput-object v7, v13, v10

    aput-object v9, v13, v12

    aput-object v11, v13, v14

    sput-object v13, Lcom/google/crypto/tink/shaded/protobuf/y$f;->$VALUES:[Lcom/google/crypto/tink/shaded/protobuf/y$f;

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

.method public static valueOf(Ljava/lang/String;)Lcom/google/crypto/tink/shaded/protobuf/y$f;
    .locals 1

    const-class v0, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/google/crypto/tink/shaded/protobuf/y$f;

    return-object p0
.end method

.method public static values()[Lcom/google/crypto/tink/shaded/protobuf/y$f;
    .locals 1

    sget-object v0, Lcom/google/crypto/tink/shaded/protobuf/y$f;->$VALUES:[Lcom/google/crypto/tink/shaded/protobuf/y$f;

    invoke-virtual {v0}, [Lcom/google/crypto/tink/shaded/protobuf/y$f;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/google/crypto/tink/shaded/protobuf/y$f;

    return-object v0
.end method
