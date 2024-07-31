.class Lwi/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lio/grpc/internal/v;
.implements Lwi/b$a;
.implements Lwi/q$d;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwi/i$e;
    }
.end annotation


# static fields
.field private static final W:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lxi/a;",
            "Lvi/g1;",
            ">;"
        }
    .end annotation
.end field

.field private static final X:Ljava/util/logging/Logger;


# instance fields
.field private final A:Ljavax/net/SocketFactory;

.field private B:Ljavax/net/ssl/SSLSocketFactory;

.field private C:Ljavax/net/ssl/HostnameVerifier;

.field private D:Ljava/net/Socket;

.field private E:I

.field private final F:Ljava/util/Deque;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Deque<",
            "Lwi/h;",
            ">;"
        }
    .end annotation
.end field

.field private final G:Lio/grpc/okhttp/internal/b;

.field private H:Lio/grpc/internal/b1;

.field private I:Z

.field private J:J

.field private K:J

.field private L:Z

.field private final M:Ljava/lang/Runnable;

.field private final N:I

.field private final O:Z

.field private final P:Lio/grpc/internal/n2;

.field private final Q:Lio/grpc/internal/v0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lio/grpc/internal/v0<",
            "Lwi/h;",
            ">;"
        }
    .end annotation
.end field

.field private R:Lvi/c0$b;

.field final S:Lvi/b0;

.field T:I

.field U:Ljava/lang/Runnable;

.field V:Lcom/google/common/util/concurrent/j;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/google/common/util/concurrent/j<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation
.end field

.field private final a:Ljava/net/InetSocketAddress;

.field private final b:Ljava/lang/String;

.field private final c:Ljava/lang/String;

.field private final d:Ljava/util/Random;

.field private final e:Leb/v;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Leb/v<",
            "Leb/t;",
            ">;"
        }
    .end annotation
.end field

.field private final f:I

.field private final g:Lxi/j;

.field private h:Lio/grpc/internal/j1$a;

.field private i:Lwi/b;

.field private j:Lwi/q;

.field private final k:Ljava/lang/Object;

.field private final l:Lvi/i0;

.field private m:I

.field private final n:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Integer;",
            "Lwi/h;",
            ">;"
        }
    .end annotation
.end field

.field private final o:Ljava/util/concurrent/Executor;

.field private final p:Lio/grpc/internal/c2;

.field private final q:Ljava/util/concurrent/ScheduledExecutorService;

.field private final r:I

.field private s:I

.field private t:Lwi/i$e;

.field private u:Lvi/a;

.field private v:Lvi/g1;

.field private w:Z

.field private x:Lio/grpc/internal/u0;

.field private y:Z

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lwi/i;->Q()Ljava/util/Map;

    move-result-object v0

    sput-object v0, Lwi/i;->W:Ljava/util/Map;

    const-class v0, Lwi/i;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/util/logging/Logger;->getLogger(Ljava/lang/String;)Ljava/util/logging/Logger;

    move-result-object v0

    sput-object v0, Lwi/i;->X:Ljava/util/logging/Logger;

    return-void
.end method

.method private constructor <init>(Lwi/f$f;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lvi/a;Leb/v;Lxi/j;Lvi/b0;Ljava/lang/Runnable;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwi/f$f;",
            "Ljava/net/InetSocketAddress;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lvi/a;",
            "Leb/v<",
            "Leb/t;",
            ">;",
            "Lxi/j;",
            "Lvi/b0;",
            "Ljava/lang/Runnable;",
            ")V"
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/Random;

    invoke-direct {v0}, Ljava/util/Random;-><init>()V

    iput-object v0, p0, Lwi/i;->d:Ljava/util/Random;

    new-instance v0, Ljava/lang/Object;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lwi/i;->n:Ljava/util/Map;

    const/4 v0, 0x0

    iput v0, p0, Lwi/i;->E:I

    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    iput-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    new-instance v0, Lwi/i$a;

    invoke-direct {v0, p0}, Lwi/i$a;-><init>(Lwi/i;)V

    iput-object v0, p0, Lwi/i;->Q:Lio/grpc/internal/v0;

    const/16 v0, 0x7530

    iput v0, p0, Lwi/i;->T:I

    const-string v0, "address"

    invoke-static {p2, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/net/InetSocketAddress;

    iput-object v0, p0, Lwi/i;->a:Ljava/net/InetSocketAddress;

    iput-object p3, p0, Lwi/i;->b:Ljava/lang/String;

    iget p3, p1, Lwi/f$f;->u:I

    iput p3, p0, Lwi/i;->r:I

    iget p3, p1, Lwi/f$f;->z:I

    iput p3, p0, Lwi/i;->f:I

    iget-object p3, p1, Lwi/f$f;->b:Ljava/util/concurrent/Executor;

    const-string v0, "executor"

    invoke-static {p3, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/concurrent/Executor;

    iput-object p3, p0, Lwi/i;->o:Ljava/util/concurrent/Executor;

    new-instance p3, Lio/grpc/internal/c2;

    iget-object v0, p1, Lwi/f$f;->b:Ljava/util/concurrent/Executor;

    invoke-direct {p3, v0}, Lio/grpc/internal/c2;-><init>(Ljava/util/concurrent/Executor;)V

    iput-object p3, p0, Lwi/i;->p:Lio/grpc/internal/c2;

    iget-object p3, p1, Lwi/f$f;->d:Ljava/util/concurrent/ScheduledExecutorService;

    const-string v0, "scheduledExecutorService"

    invoke-static {p3, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/concurrent/ScheduledExecutorService;

    iput-object p3, p0, Lwi/i;->q:Ljava/util/concurrent/ScheduledExecutorService;

    const/4 p3, 0x3

    iput p3, p0, Lwi/i;->m:I

    iget-object p3, p1, Lwi/f$f;->f:Ljavax/net/SocketFactory;

    if-nez p3, :cond_0

    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    move-result-object p3

    :cond_0
    iput-object p3, p0, Lwi/i;->A:Ljavax/net/SocketFactory;

    iget-object p3, p1, Lwi/f$f;->r:Ljavax/net/ssl/SSLSocketFactory;

    iput-object p3, p0, Lwi/i;->B:Ljavax/net/ssl/SSLSocketFactory;

    iget-object p3, p1, Lwi/f$f;->s:Ljavax/net/ssl/HostnameVerifier;

    iput-object p3, p0, Lwi/i;->C:Ljavax/net/ssl/HostnameVerifier;

    iget-object p3, p1, Lwi/f$f;->t:Lio/grpc/okhttp/internal/b;

    const-string v0, "connectionSpec"

    invoke-static {p3, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lio/grpc/okhttp/internal/b;

    iput-object p3, p0, Lwi/i;->G:Lio/grpc/okhttp/internal/b;

    const-string p3, "stopwatchFactory"

    invoke-static {p6, p3}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Leb/v;

    iput-object p3, p0, Lwi/i;->e:Leb/v;

    const-string p3, "variant"

    invoke-static {p7, p3}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Lxi/j;

    iput-object p3, p0, Lwi/i;->g:Lxi/j;

    const-string p3, "okhttp"

    invoke-static {p3, p4}, Lio/grpc/internal/q0;->g(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p3

    iput-object p3, p0, Lwi/i;->c:Ljava/lang/String;

    iput-object p8, p0, Lwi/i;->S:Lvi/b0;

    const-string p3, "tooManyPingsRunnable"

    invoke-static {p9, p3}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Runnable;

    iput-object p3, p0, Lwi/i;->M:Ljava/lang/Runnable;

    iget p3, p1, Lwi/f$f;->B:I

    iput p3, p0, Lwi/i;->N:I

    iget-object p3, p1, Lwi/f$f;->e:Lio/grpc/internal/n2$b;

    invoke-virtual {p3}, Lio/grpc/internal/n2$b;->a()Lio/grpc/internal/n2;

    move-result-object p3

    iput-object p3, p0, Lwi/i;->P:Lio/grpc/internal/n2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p3

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p3, p2}, Lvi/i0;->a(Ljava/lang/Class;Ljava/lang/String;)Lvi/i0;

    move-result-object p2

    iput-object p2, p0, Lwi/i;->l:Lvi/i0;

    invoke-static {}, Lvi/a;->c()Lvi/a$b;

    move-result-object p2

    sget-object p3, Lio/grpc/internal/p0;->b:Lvi/a$c;

    invoke-virtual {p2, p3, p5}, Lvi/a$b;->d(Lvi/a$c;Ljava/lang/Object;)Lvi/a$b;

    move-result-object p2

    invoke-virtual {p2}, Lvi/a$b;->a()Lvi/a;

    move-result-object p2

    iput-object p2, p0, Lwi/i;->u:Lvi/a;

    iget-boolean p1, p1, Lwi/f$f;->C:Z

    iput-boolean p1, p0, Lwi/i;->O:Z

    invoke-direct {p0}, Lwi/i;->a0()V

    return-void
.end method

.method public constructor <init>(Lwi/f$f;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lvi/a;Lvi/b0;Ljava/lang/Runnable;)V
    .locals 10

    sget-object v6, Lio/grpc/internal/q0;->w:Leb/v;

    new-instance v7, Lxi/g;

    invoke-direct {v7}, Lxi/g;-><init>()V

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object/from16 v8, p6

    move-object/from16 v9, p7

    invoke-direct/range {v0 .. v9}, Lwi/i;-><init>(Lwi/f$f;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;Lvi/a;Leb/v;Lxi/j;Lvi/b0;Ljava/lang/Runnable;)V

    return-void
.end method

.method static synthetic A(Lwi/i;Lxi/a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lwi/i;->f0(Lxi/a;Ljava/lang/String;)V

    return-void
.end method

.method static synthetic B(Lwi/i;)I
    .locals 0

    iget p0, p0, Lwi/i;->s:I

    return p0
.end method

.method static synthetic C(Lwi/i;I)I
    .locals 0

    iput p1, p0, Lwi/i;->s:I

    return p1
.end method

.method static synthetic D(Lwi/i;I)I
    .locals 1

    iget v0, p0, Lwi/i;->s:I

    add-int/2addr v0, p1

    iput v0, p0, Lwi/i;->s:I

    return v0
.end method

.method static synthetic E(Lwi/i;)I
    .locals 0

    iget p0, p0, Lwi/i;->N:I

    return p0
.end method

.method static synthetic F(Lwi/i;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lwi/i;->n:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic G(Lwi/i;)Lio/grpc/internal/u0;
    .locals 0

    iget-object p0, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    return-object p0
.end method

.method static synthetic H(Lwi/i;Lio/grpc/internal/u0;)Lio/grpc/internal/u0;
    .locals 0

    iput-object p1, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    return-object p1
.end method

.method static synthetic I(Lwi/i;)Ljava/lang/Runnable;
    .locals 0

    iget-object p0, p0, Lwi/i;->M:Ljava/lang/Runnable;

    return-object p0
.end method

.method static synthetic J(Lwi/i;)I
    .locals 0

    iget p0, p0, Lwi/i;->f:I

    return p0
.end method

.method static synthetic K(Lwi/i;)Ljava/net/InetSocketAddress;
    .locals 0

    iget-object p0, p0, Lwi/i;->a:Ljava/net/InetSocketAddress;

    return-object p0
.end method

.method static synthetic L(Lwi/i;)Ljavax/net/SocketFactory;
    .locals 0

    iget-object p0, p0, Lwi/i;->A:Ljavax/net/SocketFactory;

    return-object p0
.end method

.method static synthetic M(Lwi/i;Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lwi/i;->S(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;

    move-result-object p0

    return-object p0
.end method

.method static synthetic N(Lwi/i;)Ljavax/net/ssl/SSLSocketFactory;
    .locals 0

    iget-object p0, p0, Lwi/i;->B:Ljavax/net/ssl/SSLSocketFactory;

    return-object p0
.end method

.method static synthetic O(Lwi/i;)Ljavax/net/ssl/HostnameVerifier;
    .locals 0

    iget-object p0, p0, Lwi/i;->C:Ljavax/net/ssl/HostnameVerifier;

    return-object p0
.end method

.method static synthetic P(Lwi/i;)Lio/grpc/okhttp/internal/b;
    .locals 0

    iget-object p0, p0, Lwi/i;->G:Lio/grpc/okhttp/internal/b;

    return-object p0
.end method

.method private static Q()Ljava/util/Map;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lxi/a;",
            "Lvi/g1;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/EnumMap;

    const-class v1, Lxi/a;

    invoke-direct {v0, v1}, Ljava/util/EnumMap;-><init>(Ljava/lang/Class;)V

    sget-object v1, Lxi/a;->NO_ERROR:Lxi/a;

    sget-object v2, Lvi/g1;->t:Lvi/g1;

    const-string v3, "No error: A GRPC status of OK should have been sent"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->PROTOCOL_ERROR:Lxi/a;

    const-string v3, "Protocol error"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->INTERNAL_ERROR:Lxi/a;

    const-string v3, "Internal error"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->FLOW_CONTROL_ERROR:Lxi/a;

    const-string v3, "Flow control error"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->STREAM_CLOSED:Lxi/a;

    const-string v3, "Stream closed"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->FRAME_TOO_LARGE:Lxi/a;

    const-string v3, "Frame too large"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->REFUSED_STREAM:Lxi/a;

    sget-object v3, Lvi/g1;->u:Lvi/g1;

    const-string v4, "Refused stream"

    invoke-virtual {v3, v4}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->CANCEL:Lxi/a;

    sget-object v3, Lvi/g1;->g:Lvi/g1;

    const-string v4, "Cancelled"

    invoke-virtual {v3, v4}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->COMPRESSION_ERROR:Lxi/a;

    const-string v3, "Compression error"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v3

    invoke-interface {v0, v1, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->CONNECT_ERROR:Lxi/a;

    const-string v3, "Connect error"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->ENHANCE_YOUR_CALM:Lxi/a;

    sget-object v2, Lvi/g1;->o:Lvi/g1;

    const-string v3, "Enhance your calm"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v1, Lxi/a;->INADEQUATE_SECURITY:Lxi/a;

    sget-object v2, Lvi/g1;->m:Lvi/g1;

    const-string v3, "Inadequate security"

    invoke-virtual {v2, v3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v2

    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    return-object v0
.end method

.method private R(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lyi/b;
    .locals 3

    new-instance v0, Lyi/a$b;

    invoke-direct {v0}, Lyi/a$b;-><init>()V

    const-string v1, "https"

    invoke-virtual {v0, v1}, Lyi/a$b;->k(Ljava/lang/String;)Lyi/a$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lyi/a$b;->h(Ljava/lang/String;)Lyi/a$b;

    move-result-object v0

    invoke-virtual {p1}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p1

    invoke-virtual {v0, p1}, Lyi/a$b;->j(I)Lyi/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lyi/a$b;->a()Lyi/a;

    move-result-object p1

    new-instance v0, Lyi/b$b;

    invoke-direct {v0}, Lyi/b$b;-><init>()V

    invoke-virtual {v0, p1}, Lyi/b$b;->e(Lyi/a;)Lyi/b$b;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Lyi/a;->c()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lyi/a;->f()I

    move-result p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "Host"

    invoke-virtual {v0, v1, p1}, Lyi/b$b;->d(Ljava/lang/String;Ljava/lang/String;)Lyi/b$b;

    move-result-object p1

    const-string v0, "User-Agent"

    iget-object v1, p0, Lwi/i;->c:Ljava/lang/String;

    invoke-virtual {p1, v0, v1}, Lyi/b$b;->d(Ljava/lang/String;Ljava/lang/String;)Lyi/b$b;

    move-result-object p1

    if-eqz p2, :cond_0

    if-eqz p3, :cond_0

    const-string v0, "Proxy-Authorization"

    invoke-static {p2, p3}, Lio/grpc/okhttp/internal/c;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, v0, p2}, Lyi/b$b;->d(Ljava/lang/String;Ljava/lang/String;)Lyi/b$b;

    :cond_0
    invoke-virtual {p1}, Lyi/b$b;->c()Lyi/b;

    move-result-object p1

    return-object p1
.end method

.method private S(Ljava/net/InetSocketAddress;Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Ljava/net/Socket;
    .locals 9

    const-string v0, "\r\n"

    const/4 v1, 0x0

    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Lwi/i;->A:Ljavax/net/SocketFactory;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    move-result-object v3

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v2, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/net/InetAddress;I)Ljava/net/Socket;

    move-result-object p2

    goto :goto_0

    :cond_0
    iget-object v2, p0, Lwi/i;->A:Ljavax/net/SocketFactory;

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    move-result p2

    invoke-virtual {v2, v3, p2}, Ljavax/net/SocketFactory;->createSocket(Ljava/lang/String;I)Ljava/net/Socket;

    move-result-object p2

    :goto_0
    move-object v1, p2

    const/4 p2, 0x1

    invoke-virtual {v1, p2}, Ljava/net/Socket;->setTcpNoDelay(Z)V

    iget v2, p0, Lwi/i;->T:I

    invoke-virtual {v1, v2}, Ljava/net/Socket;->setSoTimeout(I)V

    invoke-static {v1}, Ldm/l;->h(Ljava/net/Socket;)Ldm/x;

    move-result-object v2

    invoke-static {v1}, Ldm/l;->e(Ljava/net/Socket;)Ldm/v;

    move-result-object v3

    invoke-static {v3}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object v3

    invoke-direct {p0, p1, p3, p4}, Lwi/i;->R(Ljava/net/InetSocketAddress;Ljava/lang/String;Ljava/lang/String;)Lyi/b;

    move-result-object p1

    invoke-virtual {p1}, Lyi/b;->b()Lyi/a;

    move-result-object p3

    sget-object p4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v4, "CONNECT %s:%d HTTP/1.1"

    const/4 v5, 0x2

    new-array v6, v5, [Ljava/lang/Object;

    invoke-virtual {p3}, Lyi/a;->c()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    aput-object v7, v6, v8

    invoke-virtual {p3}, Lyi/a;->f()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    aput-object p3, v6, p2

    invoke-static {p4, v4, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p3

    invoke-interface {v3, p3}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object p3

    invoke-interface {p3, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    invoke-virtual {p1}, Lyi/b;->a()Lio/grpc/okhttp/internal/e;

    move-result-object p3

    invoke-virtual {p3}, Lio/grpc/okhttp/internal/e;->b()I

    move-result p3

    move p4, v8

    :goto_1
    if-ge p4, p3, :cond_1

    invoke-virtual {p1}, Lyi/b;->a()Lio/grpc/okhttp/internal/e;

    move-result-object v4

    invoke-virtual {v4, p4}, Lio/grpc/okhttp/internal/e;->a(I)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v4

    const-string v6, ": "

    invoke-interface {v4, v6}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v4

    invoke-virtual {p1}, Lyi/b;->a()Lio/grpc/okhttp/internal/e;

    move-result-object v6

    invoke-virtual {v6, p4}, Lio/grpc/okhttp/internal/e;->c(I)Ljava/lang/String;

    move-result-object v6

    invoke-interface {v4, v6}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    move-result-object v4

    invoke-interface {v4, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    add-int/lit8 p4, p4, 0x1

    goto :goto_1

    :cond_1
    invoke-interface {v3, v0}, Ldm/c;->T(Ljava/lang/String;)Ldm/c;

    invoke-interface {v3}, Ldm/c;->flush()V

    invoke-static {v2}, Lwi/i;->g0(Ldm/x;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lio/grpc/okhttp/internal/j;->a(Ljava/lang/String;)Lio/grpc/okhttp/internal/j;

    move-result-object p1

    :goto_2
    invoke-static {v2}, Lwi/i;->g0(Ldm/x;)Ljava/lang/String;

    move-result-object p3

    const-string p4, ""

    invoke-virtual {p3, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p3

    if-nez p3, :cond_2

    goto :goto_2

    :cond_2
    iget p3, p1, Lio/grpc/okhttp/internal/j;->b:I

    const/16 p4, 0xc8

    if-lt p3, p4, :cond_3

    const/16 p4, 0x12c

    if-ge p3, p4, :cond_3

    invoke-virtual {v1, v8}, Ljava/net/Socket;->setSoTimeout(I)V

    return-object v1

    :cond_3
    new-instance p3, Ldm/b;

    invoke-direct {p3}, Ldm/b;-><init>()V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2

    :try_start_1
    invoke-virtual {v1}, Ljava/net/Socket;->shutdownOutput()V

    const-wide/16 v3, 0x400

    invoke-interface {v2, p3, v3, v4}, Ldm/x;->s1(Ldm/b;J)J
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_3

    :catch_0
    move-exception p4

    :try_start_2
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unable to read body: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ldm/b;->c1(Ljava/lang/String;)Ldm/b;
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2

    :goto_3
    :try_start_3
    invoke-virtual {v1}, Ljava/net/Socket;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    :catch_1
    :try_start_4
    sget-object p4, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v0, "Response returned from proxy was not successful (expected 2xx, got %d %s). Response body:\n%s"

    const/4 v2, 0x3

    new-array v2, v2, [Ljava/lang/Object;

    iget v3, p1, Lio/grpc/okhttp/internal/j;->b:I

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v2, v8

    iget-object p1, p1, Lio/grpc/okhttp/internal/j;->c:Ljava/lang/String;

    aput-object p1, v2, p2

    invoke-virtual {p3}, Ldm/b;->h0()Ljava/lang/String;

    move-result-object p1

    aput-object p1, v2, v5

    invoke-static {p4, v0, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    sget-object p2, Lvi/g1;->u:Lvi/g1;

    invoke-virtual {p2, p1}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p1}, Lvi/g1;->c()Lvi/h1;

    move-result-object p1

    throw p1
    :try_end_4
    .catch Ljava/io/IOException; {:try_start_4 .. :try_end_4} :catch_2

    :catch_2
    move-exception p1

    if-eqz v1, :cond_4

    invoke-static {v1}, Lio/grpc/internal/q0;->e(Ljava/io/Closeable;)V

    :cond_4
    sget-object p2, Lvi/g1;->u:Lvi/g1;

    const-string p3, "Failed trying to connect with proxy"

    invoke-virtual {p2, p3}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object p2

    invoke-virtual {p2, p1}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p1

    invoke-virtual {p1}, Lvi/g1;->c()Lvi/h1;

    move-result-object p1

    throw p1
.end method

.method private Y()Ljava/lang/Throwable;
    .locals 3

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->v:Lvi/g1;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lvi/g1;->c()Lvi/h1;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :cond_0
    sget-object v1, Lvi/g1;->u:Lvi/g1;

    const-string v2, "Connection closed"

    invoke-virtual {v1, v2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v1

    invoke-virtual {v1}, Lvi/g1;->c()Lvi/h1;

    move-result-object v1

    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private a0()V
    .locals 3

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->P:Lio/grpc/internal/n2;

    new-instance v2, Lwi/i$b;

    invoke-direct {v2, p0}, Lwi/i$b;-><init>(Lwi/i;)V

    invoke-virtual {v1, v2}, Lio/grpc/internal/n2;->g(Lio/grpc/internal/n2$c;)V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method private d0(Lwi/h;)V
    .locals 2

    iget-boolean v0, p0, Lwi/i;->z:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    iput-boolean v1, p0, Lwi/i;->z:Z

    iget-object v0, p0, Lwi/i;->H:Lio/grpc/internal/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/b1;->n()V

    :cond_0
    invoke-virtual {p1}, Lio/grpc/internal/a;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwi/i;->Q:Lio/grpc/internal/v0;

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    :cond_1
    return-void
.end method

.method private f0(Lxi/a;Ljava/lang/String;)V
    .locals 1

    invoke-static {p1}, Lwi/i;->p0(Lxi/a;)Lvi/g1;

    move-result-object v0

    invoke-virtual {v0, p2}, Lvi/g1;->f(Ljava/lang/String;)Lvi/g1;

    move-result-object p2

    const/4 v0, 0x0

    invoke-direct {p0, v0, p1, p2}, Lwi/i;->k0(ILxi/a;Lvi/g1;)V

    return-void
.end method

.method private static g0(Ldm/x;)Ljava/lang/String;
    .locals 7

    new-instance v0, Ldm/b;

    invoke-direct {v0}, Ldm/b;-><init>()V

    :cond_0
    const-wide/16 v1, 0x1

    invoke-interface {p0, v0, v1, v2}, Ldm/x;->s1(Ldm/b;J)J

    move-result-wide v3

    const-wide/16 v5, -0x1

    cmp-long v3, v3, v5

    if-eqz v3, :cond_1

    invoke-virtual {v0}, Ldm/b;->size()J

    move-result-wide v3

    sub-long/2addr v3, v1

    invoke-virtual {v0, v3, v4}, Ldm/b;->l(J)B

    move-result v1

    const/16 v2, 0xa

    if-ne v1, v2, :cond_0

    invoke-virtual {v0}, Ldm/b;->d0()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_1
    new-instance p0, Ljava/io/EOFException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "\\n not found: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ldm/b;->I()Ldm/e;

    move-result-object v0

    invoke-virtual {v0}, Ldm/e;->r()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/io/EOFException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method static synthetic i(Lwi/i;)Lio/grpc/internal/j1$a;
    .locals 0

    iget-object p0, p0, Lwi/i;->h:Lio/grpc/internal/j1$a;

    return-object p0
.end method

.method private i0()V
    .locals 5

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->i:Lwi/b;

    invoke-virtual {v1}, Lwi/b;->G()V

    new-instance v1, Lxi/i;

    invoke-direct {v1}, Lxi/i;-><init>()V

    iget v2, p0, Lwi/i;->f:I

    const/4 v3, 0x7

    invoke-static {v1, v3, v2}, Lwi/m;->c(Lxi/i;II)V

    iget-object v2, p0, Lwi/i;->i:Lwi/b;

    invoke-virtual {v2, v1}, Lwi/b;->P0(Lxi/i;)V

    iget v1, p0, Lwi/i;->f:I

    const v2, 0xffff

    if-le v1, v2, :cond_0

    iget-object v3, p0, Lwi/i;->i:Lwi/b;

    sub-int/2addr v1, v2

    int-to-long v1, v1

    const/4 v4, 0x0

    invoke-virtual {v3, v4, v1, v2}, Lwi/b;->d(IJ)V

    :cond_0
    monitor-exit v0

    return-void

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method static synthetic j(Lwi/i;)Ljava/lang/Object;
    .locals 0

    iget-object p0, p0, Lwi/i;->k:Ljava/lang/Object;

    return-object p0
.end method

.method private j0(Lwi/h;)V
    .locals 2

    iget-boolean v0, p0, Lwi/i;->z:Z

    const/4 v1, 0x1

    if-nez v0, :cond_0

    iput-boolean v1, p0, Lwi/i;->z:Z

    iget-object v0, p0, Lwi/i;->H:Lio/grpc/internal/b1;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lio/grpc/internal/b1;->m()V

    :cond_0
    invoke-virtual {p1}, Lio/grpc/internal/a;->x()Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lwi/i;->Q:Lio/grpc/internal/v0;

    invoke-virtual {v0, p1, v1}, Lio/grpc/internal/v0;->e(Ljava/lang/Object;Z)V

    :cond_1
    return-void
.end method

.method static synthetic k(Lwi/i;)Lvi/a;
    .locals 0

    iget-object p0, p0, Lwi/i;->u:Lvi/a;

    return-object p0
.end method

.method private k0(ILxi/a;Lvi/g1;)V
    .locals 7

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->v:Lvi/g1;

    if-nez v1, :cond_0

    iput-object p3, p0, Lwi/i;->v:Lvi/g1;

    iget-object v1, p0, Lwi/i;->h:Lio/grpc/internal/j1$a;

    invoke-interface {v1, p3}, Lio/grpc/internal/j1$a;->d(Lvi/g1;)V

    :cond_0
    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz p2, :cond_1

    iget-boolean v3, p0, Lwi/i;->w:Z

    if-nez v3, :cond_1

    iput-boolean v1, p0, Lwi/i;->w:Z

    iget-object v3, p0, Lwi/i;->i:Lwi/b;

    new-array v4, v2, [B

    invoke-virtual {v3, v2, p2, v4}, Lwi/b;->F(ILxi/a;[B)V

    :cond_1
    iget-object p2, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_2
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4

    if-le v4, p1, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->remove()V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwi/h;

    invoke-virtual {v4}, Lwi/h;->M()Lwi/h$b;

    move-result-object v4

    sget-object v5, Lio/grpc/internal/r$a;->REFUSED:Lio/grpc/internal/r$a;

    new-instance v6, Lvi/w0;

    invoke-direct {v6}, Lvi/w0;-><init>()V

    invoke-virtual {v4, p3, v5, v2, v6}, Lio/grpc/internal/a$c;->M(Lvi/g1;Lio/grpc/internal/r$a;ZLvi/w0;)V

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwi/h;

    invoke-direct {p0, v3}, Lwi/i;->d0(Lwi/h;)V

    goto :goto_0

    :cond_3
    iget-object p1, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lwi/h;

    invoke-virtual {p2}, Lwi/h;->M()Lwi/h$b;

    move-result-object v2

    sget-object v3, Lio/grpc/internal/r$a;->MISCARRIED:Lio/grpc/internal/r$a;

    new-instance v4, Lvi/w0;

    invoke-direct {v4}, Lvi/w0;-><init>()V

    invoke-virtual {v2, p3, v3, v1, v4}, Lio/grpc/internal/a$c;->M(Lvi/g1;Lio/grpc/internal/r$a;ZLvi/w0;)V

    invoke-direct {p0, p2}, Lwi/i;->d0(Lwi/h;)V

    goto :goto_1

    :cond_4
    iget-object p1, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    invoke-direct {p0}, Lwi/i;->n0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method static synthetic l(Lwi/i;Lvi/a;)Lvi/a;
    .locals 0

    iput-object p1, p0, Lwi/i;->u:Lvi/a;

    return-object p1
.end method

.method private l0()Z
    .locals 3

    const/4 v0, 0x0

    :goto_0
    iget-object v1, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    iget v2, p0, Lwi/i;->E:I

    if-ge v1, v2, :cond_0

    iget-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Deque;->poll()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwi/h;

    invoke-direct {p0, v0}, Lwi/i;->m0(Lwi/h;)V

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    return v0
.end method

.method static synthetic m(Lwi/i;ILxi/a;Lvi/g1;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lwi/i;->k0(ILxi/a;Lvi/g1;)V

    return-void
.end method

.method private m0(Lwi/h;)V
    .locals 3

    invoke-virtual {p1}, Lwi/h;->M()Lwi/h$b;

    move-result-object v0

    invoke-virtual {v0}, Lwi/h$b;->c0()I

    move-result v0

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "StreamId already assigned"

    invoke-static {v0, v1}, Leb/o;->v(ZLjava/lang/Object;)V

    iget-object v0, p0, Lwi/i;->n:Ljava/util/Map;

    iget v1, p0, Lwi/i;->m:I

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v0, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-direct {p0, p1}, Lwi/i;->j0(Lwi/h;)V

    invoke-virtual {p1}, Lwi/h;->M()Lwi/h$b;

    move-result-object v0

    iget v1, p0, Lwi/i;->m:I

    invoke-virtual {v0, v1}, Lwi/h$b;->f0(I)V

    invoke-virtual {p1}, Lwi/h;->L()Lvi/x0$d;

    move-result-object v0

    sget-object v1, Lvi/x0$d;->UNARY:Lvi/x0$d;

    if-eq v0, v1, :cond_1

    invoke-virtual {p1}, Lwi/h;->L()Lvi/x0$d;

    move-result-object v0

    sget-object v1, Lvi/x0$d;->SERVER_STREAMING:Lvi/x0$d;

    if-ne v0, v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lwi/h;->N()Z

    move-result p1

    if-eqz p1, :cond_3

    :cond_2
    iget-object p1, p0, Lwi/i;->i:Lwi/b;

    invoke-virtual {p1}, Lwi/b;->flush()V

    :cond_3
    iget p1, p0, Lwi/i;->m:I

    const v0, 0x7ffffffd

    if-lt p1, v0, :cond_4

    const p1, 0x7fffffff

    iput p1, p0, Lwi/i;->m:I

    sget-object v0, Lxi/a;->NO_ERROR:Lxi/a;

    sget-object v1, Lvi/g1;->u:Lvi/g1;

    const-string v2, "Stream ids exhausted"

    invoke-virtual {v1, v2}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lwi/i;->k0(ILxi/a;Lvi/g1;)V

    goto :goto_1

    :cond_4
    add-int/lit8 p1, p1, 0x2

    iput p1, p0, Lwi/i;->m:I

    :goto_1
    return-void
.end method

.method static synthetic n(Lwi/i;)Lwi/i$e;
    .locals 0

    iget-object p0, p0, Lwi/i;->t:Lwi/i$e;

    return-object p0
.end method

.method private n0()V
    .locals 4

    iget-object v0, p0, Lwi/i;->v:Lvi/g1;

    if-eqz v0, :cond_5

    iget-object v0, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    iget-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v0}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    iget-boolean v0, p0, Lwi/i;->y:Z

    if-eqz v0, :cond_1

    return-void

    :cond_1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lwi/i;->y:Z

    iget-object v1, p0, Lwi/i;->H:Lio/grpc/internal/b1;

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Lio/grpc/internal/b1;->p()V

    :cond_2
    iget-object v1, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    if-eqz v1, :cond_3

    invoke-direct {p0}, Lwi/i;->Y()Ljava/lang/Throwable;

    move-result-object v2

    invoke-virtual {v1, v2}, Lio/grpc/internal/u0;->f(Ljava/lang/Throwable;)V

    const/4 v1, 0x0

    iput-object v1, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    :cond_3
    iget-boolean v1, p0, Lwi/i;->w:Z

    if-nez v1, :cond_4

    iput-boolean v0, p0, Lwi/i;->w:Z

    iget-object v0, p0, Lwi/i;->i:Lwi/b;

    sget-object v1, Lxi/a;->NO_ERROR:Lxi/a;

    const/4 v2, 0x0

    new-array v3, v2, [B

    invoke-virtual {v0, v2, v1, v3}, Lwi/b;->F(ILxi/a;[B)V

    :cond_4
    iget-object v0, p0, Lwi/i;->i:Lwi/b;

    invoke-virtual {v0}, Lwi/b;->close()V

    :cond_5
    :goto_0
    return-void
.end method

.method static synthetic o(Lwi/i;Lwi/i$e;)Lwi/i$e;
    .locals 0

    iput-object p1, p0, Lwi/i;->t:Lwi/i$e;

    return-object p1
.end method

.method static synthetic p(Lwi/i;)Lxi/j;
    .locals 0

    iget-object p0, p0, Lwi/i;->g:Lxi/j;

    return-object p0
.end method

.method static p0(Lxi/a;)Lvi/g1;
    .locals 3

    sget-object v0, Lwi/i;->W:Ljava/util/Map;

    invoke-interface {v0, p0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lvi/g1;

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object v0, Lvi/g1;->h:Lvi/g1;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Unknown http2 error code: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p0, p0, Lxi/a;->httpCode:I

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lvi/g1;->r(Ljava/lang/String;)Lvi/g1;

    move-result-object v0

    :goto_0
    return-object v0
.end method

.method static synthetic q(Lwi/i;Ljava/net/Socket;)Ljava/net/Socket;
    .locals 0

    iput-object p1, p0, Lwi/i;->D:Ljava/net/Socket;

    return-object p1
.end method

.method static synthetic r(Lwi/i;Lvi/c0$b;)Lvi/c0$b;
    .locals 0

    iput-object p1, p0, Lwi/i;->R:Lvi/c0$b;

    return-object p1
.end method

.method static synthetic s(Lwi/i;)Ljava/util/concurrent/Executor;
    .locals 0

    iget-object p0, p0, Lwi/i;->o:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method static synthetic t(Lwi/i;I)I
    .locals 0

    iput p1, p0, Lwi/i;->E:I

    return p1
.end method

.method static synthetic u(Lwi/i;)Z
    .locals 0

    invoke-direct {p0}, Lwi/i;->l0()Z

    move-result p0

    return p0
.end method

.method static synthetic v(Lwi/i;)Lio/grpc/internal/b1;
    .locals 0

    iget-object p0, p0, Lwi/i;->H:Lio/grpc/internal/b1;

    return-object p0
.end method

.method static synthetic w(Lwi/i;)Lwi/q;
    .locals 0

    iget-object p0, p0, Lwi/i;->j:Lwi/q;

    return-object p0
.end method

.method static synthetic x(Lwi/i;)Lvi/g1;
    .locals 0

    iget-object p0, p0, Lwi/i;->v:Lvi/g1;

    return-object p0
.end method

.method static synthetic y()Ljava/util/logging/Logger;
    .locals 1

    sget-object v0, Lwi/i;->X:Ljava/util/logging/Logger;

    return-object v0
.end method

.method static synthetic z(Lwi/i;)Lwi/b;
    .locals 0

    iget-object p0, p0, Lwi/i;->i:Lwi/b;

    return-object p0
.end method


# virtual methods
.method T(ZJJZ)V
    .locals 0

    iput-boolean p1, p0, Lwi/i;->I:Z

    iput-wide p2, p0, Lwi/i;->J:J

    iput-wide p4, p0, Lwi/i;->K:J

    iput-boolean p6, p0, Lwi/i;->L:Z

    return-void
.end method

.method U(ILvi/g1;Lio/grpc/internal/r$a;ZLxi/a;Lvi/w0;)V
    .locals 3

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lwi/h;

    if-eqz v1, :cond_3

    if-eqz p5, :cond_0

    iget-object p5, p0, Lwi/i;->i:Lwi/b;

    sget-object v2, Lxi/a;->CANCEL:Lxi/a;

    invoke-virtual {p5, p1, v2}, Lwi/b;->s(ILxi/a;)V

    :cond_0
    if-eqz p2, :cond_2

    invoke-virtual {v1}, Lwi/h;->M()Lwi/h$b;

    move-result-object p1

    if-eqz p6, :cond_1

    goto :goto_0

    :cond_1
    new-instance p6, Lvi/w0;

    invoke-direct {p6}, Lvi/w0;-><init>()V

    :goto_0
    invoke-virtual {p1, p2, p3, p4, p6}, Lio/grpc/internal/a$c;->M(Lvi/g1;Lio/grpc/internal/r$a;ZLvi/w0;)V

    :cond_2
    invoke-direct {p0}, Lwi/i;->l0()Z

    move-result p1

    if-nez p1, :cond_3

    invoke-direct {p0}, Lwi/i;->n0()V

    invoke-direct {p0, v1}, Lwi/i;->d0(Lwi/h;)V

    :cond_3
    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public V()Lvi/a;
    .locals 1

    iget-object v0, p0, Lwi/i;->u:Lvi/a;

    return-object v0
.end method

.method W()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lwi/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/grpc/internal/q0;->b(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_0
    iget-object v0, p0, Lwi/i;->b:Ljava/lang/String;

    return-object v0
.end method

.method X()I
    .locals 3

    iget-object v0, p0, Lwi/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lio/grpc/internal/q0;->b(Ljava/lang/String;)Ljava/net/URI;

    move-result-object v0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v1

    const/4 v2, -0x1

    if-eq v1, v2, :cond_0

    invoke-virtual {v0}, Ljava/net/URI;->getPort()I

    move-result v0

    return v0

    :cond_0
    iget-object v0, p0, Lwi/i;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0}, Ljava/net/InetSocketAddress;->getPort()I

    move-result v0

    return v0
.end method

.method Z(I)Lwi/h;
    .locals 2

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lwi/h;

    monitor-exit v0

    return-object p1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a()[Lwi/q$c;
    .locals 6

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->size()I

    move-result v1

    new-array v1, v1, [Lwi/q$c;

    iget-object v2, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lwi/h;

    add-int/lit8 v5, v3, 0x1

    invoke-virtual {v4}, Lwi/h;->M()Lwi/h$b;

    move-result-object v4

    invoke-virtual {v4}, Lwi/h$b;->b0()Lwi/q$c;

    move-result-object v4

    aput-object v4, v1, v3

    move v3, v5

    goto :goto_0

    :cond_0
    monitor-exit v0

    return-object v1

    :catchall_0
    move-exception v1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1
.end method

.method public b(Lvi/g1;)V
    .locals 7

    invoke-virtual {p0, p1}, Lwi/i;->d(Lvi/g1;)V

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map$Entry;

    invoke-interface {v1}, Ljava/util/Iterator;->remove()V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lwi/h;

    invoke-virtual {v3}, Lwi/h;->M()Lwi/h$b;

    move-result-object v3

    new-instance v4, Lvi/w0;

    invoke-direct {v4}, Lvi/w0;-><init>()V

    const/4 v5, 0x0

    invoke-virtual {v3, p1, v5, v4}, Lio/grpc/internal/a$c;->N(Lvi/g1;ZLvi/w0;)V

    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwi/h;

    invoke-direct {p0, v2}, Lwi/i;->d0(Lwi/h;)V

    goto :goto_0

    :cond_0
    iget-object v1, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v1}, Ljava/util/Deque;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lwi/h;

    invoke-virtual {v2}, Lwi/h;->M()Lwi/h$b;

    move-result-object v3

    sget-object v4, Lio/grpc/internal/r$a;->MISCARRIED:Lio/grpc/internal/r$a;

    new-instance v5, Lvi/w0;

    invoke-direct {v5}, Lvi/w0;-><init>()V

    const/4 v6, 0x1

    invoke-virtual {v3, p1, v4, v6, v5}, Lio/grpc/internal/a$c;->M(Lvi/g1;Lio/grpc/internal/r$a;ZLvi/w0;)V

    invoke-direct {p0, v2}, Lwi/i;->d0(Lwi/h;)V

    goto :goto_1

    :cond_1
    iget-object p1, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {p1}, Ljava/util/Collection;->clear()V

    invoke-direct {p0}, Lwi/i;->n0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method b0()Z
    .locals 1

    iget-object v0, p0, Lwi/i;->B:Ljavax/net/ssl/SSLSocketFactory;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public bridge synthetic c(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lio/grpc/internal/q;
    .locals 0

    invoke-virtual {p0, p1, p2, p3, p4}, Lwi/i;->e0(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lwi/h;

    move-result-object p1

    return-object p1
.end method

.method c0(I)Z
    .locals 2

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget v1, p0, Lwi/i;->m:I

    if-ge p1, v1, :cond_0

    const/4 v1, 0x1

    and-int/2addr p1, v1

    if-ne p1, v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    monitor-exit v0

    return v1

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public d(Lvi/g1;)V
    .locals 2

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->v:Lvi/g1;

    if-eqz v1, :cond_0

    monitor-exit v0

    return-void

    :cond_0
    iput-object p1, p0, Lwi/i;->v:Lvi/g1;

    iget-object v1, p0, Lwi/i;->h:Lio/grpc/internal/j1$a;

    invoke-interface {v1, p1}, Lio/grpc/internal/j1$a;->d(Lvi/g1;)V

    invoke-direct {p0}, Lwi/i;->n0()V

    monitor-exit v0

    return-void

    :catchall_0
    move-exception p1

    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public e()Lvi/i0;
    .locals 1

    iget-object v0, p0, Lwi/i;->l:Lvi/i0;

    return-object v0
.end method

.method public e0(Lvi/x0;Lvi/w0;Lvi/c;[Lvi/k;)Lwi/h;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lvi/x0<",
            "**>;",
            "Lvi/w0;",
            "Lvi/c;",
            "[",
            "Lvi/k;",
            ")",
            "Lwi/h;"
        }
    .end annotation

    move-object/from16 v15, p0

    move-object/from16 v0, p2

    const-string v1, "method"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "headers"

    invoke-static {v0, v1}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual/range {p0 .. p0}, Lwi/i;->V()Lvi/a;

    move-result-object v1

    move-object/from16 v3, p4

    invoke-static {v3, v1, v0}, Lio/grpc/internal/h2;->h([Lvi/k;Lvi/a;Lvi/w0;)Lio/grpc/internal/h2;

    move-result-object v12

    iget-object v14, v15, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v14

    :try_start_0
    new-instance v16, Lwi/h;

    iget-object v4, v15, Lwi/i;->i:Lwi/b;

    iget-object v6, v15, Lwi/i;->j:Lwi/q;

    iget-object v7, v15, Lwi/i;->k:Ljava/lang/Object;

    iget v8, v15, Lwi/i;->r:I

    iget v9, v15, Lwi/i;->f:I

    iget-object v10, v15, Lwi/i;->b:Ljava/lang/String;

    iget-object v11, v15, Lwi/i;->c:Ljava/lang/String;

    iget-object v13, v15, Lwi/i;->P:Lio/grpc/internal/n2;

    iget-boolean v5, v15, Lwi/i;->O:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-object/from16 v1, v16

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move v0, v5

    move-object/from16 v5, p0

    move-object/from16 v17, v14

    move-object/from16 v14, p3

    move v15, v0

    :try_start_1
    invoke-direct/range {v1 .. v15}, Lwi/h;-><init>(Lvi/x0;Lvi/w0;Lwi/b;Lwi/i;Lwi/q;Ljava/lang/Object;IILjava/lang/String;Ljava/lang/String;Lio/grpc/internal/h2;Lio/grpc/internal/n2;Lvi/c;Z)V

    monitor-exit v17

    return-object v16

    :catchall_0
    move-exception v0

    move-object/from16 v17, v14

    :goto_0
    monitor-exit v17
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    throw v0

    :catchall_1
    move-exception v0

    goto :goto_0
.end method

.method public f(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V
    .locals 8

    iget-object v0, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lwi/i;->i:Lwi/b;

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    invoke-static {v1}, Leb/o;->u(Z)V

    iget-boolean v1, p0, Lwi/i;->y:Z

    if-eqz v1, :cond_1

    invoke-direct {p0}, Lwi/i;->Y()Ljava/lang/Throwable;

    move-result-object v1

    invoke-static {p1, p2, v1}, Lio/grpc/internal/u0;->g(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;Ljava/lang/Throwable;)V

    monitor-exit v0

    return-void

    :cond_1
    iget-object v1, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    if-eqz v1, :cond_2

    const-wide/16 v4, 0x0

    move v2, v3

    goto :goto_1

    :cond_2
    iget-object v1, p0, Lwi/i;->d:Ljava/util/Random;

    invoke-virtual {v1}, Ljava/util/Random;->nextLong()J

    move-result-wide v4

    iget-object v1, p0, Lwi/i;->e:Leb/v;

    invoke-interface {v1}, Leb/v;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Leb/t;

    invoke-virtual {v1}, Leb/t;->g()Leb/t;

    new-instance v6, Lio/grpc/internal/u0;

    invoke-direct {v6, v4, v5, v1}, Lio/grpc/internal/u0;-><init>(JLeb/t;)V

    iput-object v6, p0, Lwi/i;->x:Lio/grpc/internal/u0;

    iget-object v1, p0, Lwi/i;->P:Lio/grpc/internal/n2;

    invoke-virtual {v1}, Lio/grpc/internal/n2;->b()V

    move-object v1, v6

    :goto_1
    if-eqz v2, :cond_3

    iget-object v2, p0, Lwi/i;->i:Lwi/b;

    const/16 v6, 0x20

    ushr-long v6, v4, v6

    long-to-int v6, v6

    long-to-int v4, v4

    invoke-virtual {v2, v3, v6, v4}, Lwi/b;->h(ZII)V

    :cond_3
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v1, p1, p2}, Lio/grpc/internal/u0;->a(Lio/grpc/internal/s$a;Ljava/util/concurrent/Executor;)V

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public g(Lio/grpc/internal/j1$a;)Ljava/lang/Runnable;
    .locals 8

    const-string v0, "listener"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lio/grpc/internal/j1$a;

    iput-object p1, p0, Lwi/i;->h:Lio/grpc/internal/j1$a;

    iget-boolean p1, p0, Lwi/i;->I:Z

    if-eqz p1, :cond_0

    new-instance p1, Lio/grpc/internal/b1;

    new-instance v1, Lio/grpc/internal/b1$c;

    invoke-direct {v1, p0}, Lio/grpc/internal/b1$c;-><init>(Lio/grpc/internal/v;)V

    iget-object v2, p0, Lwi/i;->q:Ljava/util/concurrent/ScheduledExecutorService;

    iget-wide v3, p0, Lwi/i;->J:J

    iget-wide v5, p0, Lwi/i;->K:J

    iget-boolean v7, p0, Lwi/i;->L:Z

    move-object v0, p1

    invoke-direct/range {v0 .. v7}, Lio/grpc/internal/b1;-><init>(Lio/grpc/internal/b1$d;Ljava/util/concurrent/ScheduledExecutorService;JJZ)V

    iput-object p1, p0, Lwi/i;->H:Lio/grpc/internal/b1;

    invoke-virtual {p1}, Lio/grpc/internal/b1;->o()V

    :cond_0
    const/16 p1, 0x2710

    iget-object v0, p0, Lwi/i;->p:Lio/grpc/internal/c2;

    invoke-static {v0, p0, p1}, Lwi/a;->y(Lio/grpc/internal/c2;Lwi/b$a;I)Lwi/a;

    move-result-object p1

    iget-object v0, p0, Lwi/i;->g:Lxi/j;

    invoke-static {p1}, Ldm/l;->a(Ldm/v;)Ldm/c;

    move-result-object v1

    const/4 v2, 0x1

    invoke-interface {v0, v1, v2}, Lxi/j;->a(Ldm/c;Z)Lxi/c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lwi/a;->r(Lxi/c;)Lxi/c;

    move-result-object v0

    iget-object v1, p0, Lwi/i;->k:Ljava/lang/Object;

    monitor-enter v1

    :try_start_0
    new-instance v3, Lwi/b;

    invoke-direct {v3, p0, v0}, Lwi/b;-><init>(Lwi/b$a;Lxi/c;)V

    iput-object v3, p0, Lwi/i;->i:Lwi/b;

    new-instance v0, Lwi/q;

    invoke-direct {v0, p0, v3}, Lwi/q;-><init>(Lwi/q$d;Lxi/c;)V

    iput-object v0, p0, Lwi/i;->j:Lwi/q;

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    new-instance v0, Ljava/util/concurrent/CountDownLatch;

    invoke-direct {v0, v2}, Ljava/util/concurrent/CountDownLatch;-><init>(I)V

    iget-object v1, p0, Lwi/i;->p:Lio/grpc/internal/c2;

    new-instance v2, Lwi/i$c;

    invoke-direct {v2, p0, v0, p1}, Lwi/i$c;-><init>(Lwi/i;Ljava/util/concurrent/CountDownLatch;Lwi/a;)V

    invoke-virtual {v1, v2}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    :try_start_1
    invoke-direct {p0}, Lwi/i;->i0()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    iget-object p1, p0, Lwi/i;->p:Lio/grpc/internal/c2;

    new-instance v0, Lwi/i$d;

    invoke-direct {v0, p0}, Lwi/i$d;-><init>(Lwi/i;)V

    invoke-virtual {p1, v0}, Lio/grpc/internal/c2;->execute(Ljava/lang/Runnable;)V

    const/4 p1, 0x0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-virtual {v0}, Ljava/util/concurrent/CountDownLatch;->countDown()V

    throw p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public h(Ljava/lang/Throwable;)V
    .locals 2

    const-string v0, "failureCause"

    invoke-static {p1, v0}, Leb/o;->p(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lvi/g1;->u:Lvi/g1;

    invoke-virtual {v0, p1}, Lvi/g1;->q(Ljava/lang/Throwable;)Lvi/g1;

    move-result-object p1

    const/4 v0, 0x0

    sget-object v1, Lxi/a;->INTERNAL_ERROR:Lxi/a;

    invoke-direct {p0, v0, v1, p1}, Lwi/i;->k0(ILxi/a;Lvi/g1;)V

    return-void
.end method

.method h0(Lwi/h;)V
    .locals 1

    iget-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->remove(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Lwi/i;->d0(Lwi/h;)V

    return-void
.end method

.method o0(Lwi/h;)V
    .locals 4

    iget-object v0, p0, Lwi/i;->v:Lvi/g1;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lwi/h;->M()Lwi/h$b;

    move-result-object p1

    iget-object v0, p0, Lwi/i;->v:Lvi/g1;

    sget-object v1, Lio/grpc/internal/r$a;->MISCARRIED:Lio/grpc/internal/r$a;

    new-instance v2, Lvi/w0;

    invoke-direct {v2}, Lvi/w0;-><init>()V

    const/4 v3, 0x1

    invoke-virtual {p1, v0, v1, v3, v2}, Lio/grpc/internal/a$c;->M(Lvi/g1;Lio/grpc/internal/r$a;ZLvi/w0;)V

    goto :goto_0

    :cond_0
    iget-object v0, p0, Lwi/i;->n:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    iget v1, p0, Lwi/i;->E:I

    if-lt v0, v1, :cond_1

    iget-object v0, p0, Lwi/i;->F:Ljava/util/Deque;

    invoke-interface {v0, p1}, Ljava/util/Deque;->add(Ljava/lang/Object;)Z

    invoke-direct {p0, p1}, Lwi/i;->j0(Lwi/h;)V

    goto :goto_0

    :cond_1
    invoke-direct {p0, p1}, Lwi/i;->m0(Lwi/h;)V

    :goto_0
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    invoke-static {p0}, Leb/i;->c(Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    iget-object v1, p0, Lwi/i;->l:Lvi/i0;

    invoke-virtual {v1}, Lvi/i0;->d()J

    move-result-wide v1

    const-string v3, "logId"

    invoke-virtual {v0, v3, v1, v2}, Leb/i$b;->c(Ljava/lang/String;J)Leb/i$b;

    move-result-object v0

    const-string v1, "address"

    iget-object v2, p0, Lwi/i;->a:Ljava/net/InetSocketAddress;

    invoke-virtual {v0, v1, v2}, Leb/i$b;->d(Ljava/lang/String;Ljava/lang/Object;)Leb/i$b;

    move-result-object v0

    invoke-virtual {v0}, Leb/i$b;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
