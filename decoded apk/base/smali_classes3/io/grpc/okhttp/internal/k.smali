.class public final enum Lio/grpc/okhttp/internal/k;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lio/grpc/okhttp/internal/k;",
        ">;"
    }
.end annotation


# static fields
.field private static final synthetic $VALUES:[Lio/grpc/okhttp/internal/k;

.field public static final enum SSL_3_0:Lio/grpc/okhttp/internal/k;

.field public static final enum TLS_1_0:Lio/grpc/okhttp/internal/k;

.field public static final enum TLS_1_1:Lio/grpc/okhttp/internal/k;

.field public static final enum TLS_1_2:Lio/grpc/okhttp/internal/k;

.field public static final enum TLS_1_3:Lio/grpc/okhttp/internal/k;


# instance fields
.field final javaName:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 12

    new-instance v0, Lio/grpc/okhttp/internal/k;

    const-string v1, "TLSv1.3"

    const-string v2, "TLS_1_3"

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Lio/grpc/okhttp/internal/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v0, Lio/grpc/okhttp/internal/k;->TLS_1_3:Lio/grpc/okhttp/internal/k;

    new-instance v1, Lio/grpc/okhttp/internal/k;

    const-string v2, "TLSv1.2"

    const-string v4, "TLS_1_2"

    const/4 v5, 0x1

    invoke-direct {v1, v4, v5, v2}, Lio/grpc/okhttp/internal/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v1, Lio/grpc/okhttp/internal/k;->TLS_1_2:Lio/grpc/okhttp/internal/k;

    new-instance v2, Lio/grpc/okhttp/internal/k;

    const-string v4, "TLSv1.1"

    const-string v6, "TLS_1_1"

    const/4 v7, 0x2

    invoke-direct {v2, v6, v7, v4}, Lio/grpc/okhttp/internal/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v2, Lio/grpc/okhttp/internal/k;->TLS_1_1:Lio/grpc/okhttp/internal/k;

    new-instance v4, Lio/grpc/okhttp/internal/k;

    const-string v6, "TLSv1"

    const-string v8, "TLS_1_0"

    const/4 v9, 0x3

    invoke-direct {v4, v8, v9, v6}, Lio/grpc/okhttp/internal/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v4, Lio/grpc/okhttp/internal/k;->TLS_1_0:Lio/grpc/okhttp/internal/k;

    new-instance v6, Lio/grpc/okhttp/internal/k;

    const-string v8, "SSLv3"

    const-string v10, "SSL_3_0"

    const/4 v11, 0x4

    invoke-direct {v6, v10, v11, v8}, Lio/grpc/okhttp/internal/k;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    sput-object v6, Lio/grpc/okhttp/internal/k;->SSL_3_0:Lio/grpc/okhttp/internal/k;

    const/4 v8, 0x5

    new-array v8, v8, [Lio/grpc/okhttp/internal/k;

    aput-object v0, v8, v3

    aput-object v1, v8, v5

    aput-object v2, v8, v7

    aput-object v4, v8, v9

    aput-object v6, v8, v11

    sput-object v8, Lio/grpc/okhttp/internal/k;->$VALUES:[Lio/grpc/okhttp/internal/k;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    iput-object p3, p0, Lio/grpc/okhttp/internal/k;->javaName:Ljava/lang/String;

    return-void
.end method

.method public static b(Ljava/lang/String;)Lio/grpc/okhttp/internal/k;
    .locals 3

    const-string v0, "TLSv1.3"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object p0, Lio/grpc/okhttp/internal/k;->TLS_1_3:Lio/grpc/okhttp/internal/k;

    return-object p0

    :cond_0
    const-string v0, "TLSv1.2"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object p0, Lio/grpc/okhttp/internal/k;->TLS_1_2:Lio/grpc/okhttp/internal/k;

    return-object p0

    :cond_1
    const-string v0, "TLSv1.1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    sget-object p0, Lio/grpc/okhttp/internal/k;->TLS_1_1:Lio/grpc/okhttp/internal/k;

    return-object p0

    :cond_2
    const-string v0, "TLSv1"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    sget-object p0, Lio/grpc/okhttp/internal/k;->TLS_1_0:Lio/grpc/okhttp/internal/k;

    return-object p0

    :cond_3
    const-string v0, "SSLv3"

    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    sget-object p0, Lio/grpc/okhttp/internal/k;->SSL_3_0:Lio/grpc/okhttp/internal/k;

    return-object p0

    :cond_4
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unexpected TLS version: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static valueOf(Ljava/lang/String;)Lio/grpc/okhttp/internal/k;
    .locals 1

    const-class v0, Lio/grpc/okhttp/internal/k;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lio/grpc/okhttp/internal/k;

    return-object p0
.end method

.method public static values()[Lio/grpc/okhttp/internal/k;
    .locals 1

    sget-object v0, Lio/grpc/okhttp/internal/k;->$VALUES:[Lio/grpc/okhttp/internal/k;

    invoke-virtual {v0}, [Lio/grpc/okhttp/internal/k;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lio/grpc/okhttp/internal/k;

    return-object v0
.end method
