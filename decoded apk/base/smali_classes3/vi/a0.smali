.class public final Lvi/a0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final b:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Ljava/net/SocketAddress;",
            ">;"
        }
    .end annotation
.end field

.field public static final c:Lvi/a$c;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lvi/a$c<",
            "Ljavax/net/ssl/SSLSession;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_REMOTE_ADDR"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lvi/a0;->a:Lvi/a$c;

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_LOCAL_ADDR"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lvi/a0;->b:Lvi/a$c;

    const-string v0, "io.grpc.Grpc.TRANSPORT_ATTR_SSL_SESSION"

    invoke-static {v0}, Lvi/a$c;->a(Ljava/lang/String;)Lvi/a$c;

    move-result-object v0

    sput-object v0, Lvi/a0;->c:Lvi/a$c;

    return-void
.end method
