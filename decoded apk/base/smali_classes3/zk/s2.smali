.class public final Lzk/s2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lzk/s2;

.field private static final b:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "Lzk/g1;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lzk/s2;

    invoke-direct {v0}, Lzk/s2;-><init>()V

    sput-object v0, Lzk/s2;->a:Lzk/s2;

    new-instance v0, Lel/h0;

    const-string v1, "ThreadLocalEventLoop"

    invoke-direct {v0, v1}, Lel/h0;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lel/m0;->a(Lel/h0;)Ljava/lang/ThreadLocal;

    move-result-object v0

    sput-object v0, Lzk/s2;->b:Ljava/lang/ThreadLocal;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Lzk/g1;
    .locals 1

    sget-object v0, Lzk/s2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lzk/g1;

    return-object v0
.end method

.method public final b()Lzk/g1;
    .locals 2

    sget-object v0, Lzk/s2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lzk/g1;

    if-nez v1, :cond_0

    invoke-static {}, Lzk/j1;->a()Lzk/g1;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    return-object v1
.end method

.method public final c()V
    .locals 2

    sget-object v0, Lzk/s2;->b:Ljava/lang/ThreadLocal;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method

.method public final d(Lzk/g1;)V
    .locals 1

    sget-object v0, Lzk/s2;->b:Ljava/lang/ThreadLocal;

    invoke-virtual {v0, p1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    return-void
.end method
