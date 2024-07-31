.class public Lzd/q2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/q2$b;
    }
.end annotation


# static fields
.field private static final h:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/t$b;",
            "Lqd/h0;",
            ">;"
        }
    .end annotation
.end field

.field private static final i:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Lqd/t$a;",
            "Lqd/i;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final a:Lzd/q2$b;

.field private final b:Lzb/g;

.field private final c:Lfe/f;

.field private final d:Lce/a;

.field private final e:Lcc/a;

.field private final f:Lzd/s;

.field private final g:Ljava/util/concurrent/Executor;
    .annotation build Ldc/b;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lzd/q2;->h:Ljava/util/Map;

    new-instance v1, Ljava/util/HashMap;

    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    sput-object v1, Lzd/q2;->i:Ljava/util/Map;

    sget-object v2, Lqd/t$b;->UNSPECIFIED_RENDER_ERROR:Lqd/t$b;

    sget-object v3, Lqd/h0;->UNSPECIFIED_RENDER_ERROR:Lqd/h0;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lqd/t$b;->IMAGE_FETCH_ERROR:Lqd/t$b;

    sget-object v3, Lqd/h0;->IMAGE_FETCH_ERROR:Lqd/h0;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lqd/t$b;->IMAGE_DISPLAY_ERROR:Lqd/t$b;

    sget-object v3, Lqd/h0;->IMAGE_DISPLAY_ERROR:Lqd/h0;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v2, Lqd/t$b;->IMAGE_UNSUPPORTED_FORMAT:Lqd/t$b;

    sget-object v3, Lqd/h0;->IMAGE_UNSUPPORTED_FORMAT:Lqd/h0;

    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lqd/t$a;->AUTO:Lqd/t$a;

    sget-object v2, Lqd/i;->AUTO:Lqd/i;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lqd/t$a;->CLICK:Lqd/t$a;

    sget-object v2, Lqd/i;->CLICK:Lqd/i;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lqd/t$a;->SWIPE:Lqd/t$a;

    sget-object v2, Lqd/i;->SWIPE:Lqd/i;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Lqd/t$a;->UNKNOWN_DISMISS_TYPE:Lqd/t$a;

    sget-object v2, Lqd/i;->UNKNOWN_DISMISS_TYPE:Lqd/i;

    invoke-interface {v1, v0, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(Lzd/q2$b;Lcc/a;Lzb/g;Lfe/f;Lce/a;Lzd/s;Ljava/util/concurrent/Executor;)V
    .locals 0
    .param p7    # Ljava/util/concurrent/Executor;
        .annotation build Ldc/b;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/q2;->a:Lzd/q2$b;

    iput-object p2, p0, Lzd/q2;->e:Lcc/a;

    iput-object p3, p0, Lzd/q2;->b:Lzb/g;

    iput-object p4, p0, Lzd/q2;->c:Lfe/f;

    iput-object p5, p0, Lzd/q2;->d:Lce/a;

    iput-object p6, p0, Lzd/q2;->f:Lzd/s;

    iput-object p7, p0, Lzd/q2;->g:Ljava/util/concurrent/Executor;

    return-void
.end method

.method public static synthetic a(Lzd/q2;Lde/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/q2;->o(Lde/i;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic b(Lzd/q2;Lde/i;Lqd/t$b;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzd/q2;->p(Lde/i;Lqd/t$b;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic c(Lzd/q2;Lde/i;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/q2;->n(Lde/i;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic d(Lzd/q2;Lde/i;Lqd/t$a;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lzd/q2;->m(Lde/i;Lqd/t$a;Ljava/lang/String;)V

    return-void
.end method

.method private f(Lde/i;Ljava/lang/String;)Lqd/a$b;
    .locals 2

    invoke-static {}, Lqd/a;->k0()Lqd/a$b;

    move-result-object v0

    const-string v1, "20.4.0"

    invoke-virtual {v0, v1}, Lqd/a$b;->N(Ljava/lang/String;)Lqd/a$b;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->b:Lzb/g;

    invoke-virtual {v1}, Lzb/g;->r()Lzb/p;

    move-result-object v1

    invoke-virtual {v1}, Lzb/p;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqd/a$b;->O(Ljava/lang/String;)Lqd/a$b;

    move-result-object v0

    invoke-virtual {p1}, Lde/i;->a()Lde/e;

    move-result-object p1

    invoke-virtual {p1}, Lde/e;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lqd/a$b;->I(Ljava/lang/String;)Lqd/a$b;

    move-result-object p1

    invoke-static {}, Lqd/b;->e0()Lqd/b$b;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->b:Lzb/g;

    invoke-virtual {v1}, Lzb/g;->r()Lzb/p;

    move-result-object v1

    invoke-virtual {v1}, Lzb/p;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lqd/b$b;->J(Ljava/lang/String;)Lqd/b$b;

    move-result-object v0

    invoke-virtual {v0, p2}, Lqd/b$b;->I(Ljava/lang/String;)Lqd/b$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lqd/a$b;->J(Lqd/b$b;)Lqd/a$b;

    move-result-object p1

    iget-object p2, p0, Lzd/q2;->d:Lce/a;

    invoke-interface {p2}, Lce/a;->a()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Lqd/a$b;->K(J)Lqd/a$b;

    move-result-object p1

    return-object p1
.end method

.method private g(Lde/i;Ljava/lang/String;Lqd/i;)Lqd/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/q2;->f(Lde/i;Ljava/lang/String;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lqd/a$b;->L(Lqd/i;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lqd/a;

    return-object p1
.end method

.method private h(Lde/i;Ljava/lang/String;Lqd/j;)Lqd/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/q2;->f(Lde/i;Ljava/lang/String;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lqd/a$b;->M(Lqd/j;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lqd/a;

    return-object p1
.end method

.method private i(Lde/i;Ljava/lang/String;Lqd/h0;)Lqd/a;
    .locals 0

    invoke-direct {p0, p1, p2}, Lzd/q2;->f(Lde/i;Ljava/lang/String;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1, p3}, Lqd/a$b;->P(Lqd/h0;)Lqd/a$b;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object p1

    check-cast p1, Lqd/a;

    return-object p1
.end method

.method private j(Lde/i;)Z
    .locals 4

    sget-object v0, Lzd/q2$a;->a:[I

    invoke-virtual {p1}, Lde/i;->c()Lcom/google/firebase/inappmessaging/model/MessageType;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v0, v0, v1

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eq v0, v2, :cond_3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_2

    const/4 v3, 0x3

    if-eq v0, v3, :cond_1

    const/4 v3, 0x4

    if-eq v0, v3, :cond_0

    const-string p1, "Unable to determine if impression should be counted as conversion."

    invoke-static {p1}, Lzd/l2;->b(Ljava/lang/String;)V

    return v1

    :cond_0
    check-cast p1, Lde/h;

    invoke-virtual {p1}, Lde/h;->e()Lde/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/q2;->l(Lde/a;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_1
    check-cast p1, Lde/c;

    invoke-virtual {p1}, Lde/c;->e()Lde/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/q2;->l(Lde/a;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_2
    check-cast p1, Lde/j;

    invoke-virtual {p1}, Lde/j;->e()Lde/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/q2;->l(Lde/a;)Z

    move-result p1

    xor-int/2addr p1, v2

    return p1

    :cond_3
    check-cast p1, Lde/f;

    invoke-virtual {p1}, Lde/f;->i()Lde/a;

    move-result-object v0

    invoke-direct {p0, v0}, Lzd/q2;->l(Lde/a;)Z

    move-result v0

    xor-int/2addr v0, v2

    invoke-virtual {p1}, Lde/f;->j()Lde/a;

    move-result-object p1

    invoke-direct {p0, p1}, Lzd/q2;->l(Lde/a;)Z

    move-result p1

    xor-int/2addr p1, v2

    if-eqz v0, :cond_4

    if-eqz p1, :cond_4

    move v1, v2

    :cond_4
    return v1
.end method

.method private k(Lde/i;)Z
    .locals 0

    invoke-virtual {p1}, Lde/i;->a()Lde/e;

    move-result-object p1

    invoke-virtual {p1}, Lde/e;->c()Z

    move-result p1

    return p1
.end method

.method private l(Lde/a;)Z
    .locals 1

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lde/a;->b()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lde/a;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->isEmpty()Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    return p1
.end method

.method private synthetic m(Lde/i;Lqd/t$a;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzd/q2;->a:Lzd/q2$b;

    sget-object v1, Lzd/q2;->i:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqd/i;

    invoke-direct {p0, p1, p3, p2}, Lzd/q2;->g(Lde/i;Ljava/lang/String;Lqd/i;)Lqd/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a;->h()[B

    move-result-object p1

    invoke-interface {v0, p1}, Lzd/q2$b;->a([B)V

    return-void
.end method

.method private synthetic n(Lde/i;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzd/q2;->a:Lzd/q2$b;

    sget-object v1, Lqd/j;->IMPRESSION_EVENT_TYPE:Lqd/j;

    invoke-direct {p0, p1, p2, v1}, Lzd/q2;->h(Lde/i;Ljava/lang/String;Lqd/j;)Lqd/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a;->h()[B

    move-result-object p1

    invoke-interface {v0, p1}, Lzd/q2$b;->a([B)V

    return-void
.end method

.method private synthetic o(Lde/i;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzd/q2;->a:Lzd/q2$b;

    sget-object v1, Lqd/j;->CLICK_EVENT_TYPE:Lqd/j;

    invoke-direct {p0, p1, p2, v1}, Lzd/q2;->h(Lde/i;Ljava/lang/String;Lqd/j;)Lqd/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a;->h()[B

    move-result-object p1

    invoke-interface {v0, p1}, Lzd/q2$b;->a([B)V

    return-void
.end method

.method private synthetic p(Lde/i;Lqd/t$b;Ljava/lang/String;)V
    .locals 2

    iget-object v0, p0, Lzd/q2;->a:Lzd/q2$b;

    sget-object v1, Lzd/q2;->h:Ljava/util/Map;

    invoke-interface {v1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lqd/h0;

    invoke-direct {p0, p1, p3, p2}, Lzd/q2;->i(Lde/i;Ljava/lang/String;Lqd/h0;)Lqd/a;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/protobuf/a;->h()[B

    move-result-object p1

    invoke-interface {v0, p1}, Lzd/q2$b;->a([B)V

    return-void
.end method

.method private r(Lde/i;Ljava/lang/String;Z)V
    .locals 3

    invoke-virtual {p1}, Lde/i;->a()Lde/e;

    move-result-object v0

    invoke-virtual {v0}, Lde/e;->a()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lde/i;->a()Lde/e;

    move-result-object p1

    invoke-virtual {p1}, Lde/e;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, v0}, Lzd/q2;->e(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object p1

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Sending event="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v2, " params="

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object v1, p0, Lzd/q2;->e:Lcc/a;

    if-eqz v1, :cond_0

    const-string v2, "fiam"

    invoke-interface {v1, v2, p2, p1}, Lcc/a;->a(Ljava/lang/String;Ljava/lang/String;Landroid/os/Bundle;)V

    if-eqz p3, :cond_1

    iget-object p1, p0, Lzd/q2;->e:Lcc/a;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string p3, "fiam:"

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    const-string p3, "_ln"

    invoke-interface {p1, v2, p3, p2}, Lcc/a;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    const-string p1, "Unable to log event: analytics library is missing"

    invoke-static {p1}, Lzd/l2;->d(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method e(Ljava/lang/String;Ljava/lang/String;)Landroid/os/Bundle;
    .locals 3

    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    const-string v1, "_nmid"

    invoke-virtual {v0, v1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    const-string p2, "_nmn"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :try_start_0
    iget-object p1, p0, Lzd/q2;->d:Lce/a;

    invoke-interface {p1}, Lce/a;->a()J

    move-result-wide p1

    const-wide/16 v1, 0x3e8

    div-long/2addr p1, v1

    long-to-int p1, p1

    const-string p2, "_ndt"

    invoke-virtual {v0, p2, p1}, Landroid/os/BaseBundle;->putInt(Ljava/lang/String;I)V
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Error while parsing use_device_time in FIAM event: "

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lzd/l2;->d(Ljava/lang/String;)V

    :goto_0
    return-object v0
.end method

.method q(Lde/i;Lqd/t$a;)V
    .locals 3

    invoke-direct {p0, p1}, Lzd/q2;->k(Lde/i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd/q2;->c:Lfe/f;

    invoke-interface {v0}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lzd/o2;

    invoke-direct {v2, p0, p1, p2}, Lzd/o2;-><init>(Lzd/q2;Lde/i;Lqd/t$a;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    const-string p2, "fiam_dismiss"

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lzd/q2;->r(Lde/i;Ljava/lang/String;Z)V

    :cond_0
    iget-object p2, p0, Lzd/q2;->f:Lzd/s;

    invoke-virtual {p2, p1}, Lzd/s;->l(Lde/i;)V

    return-void
.end method

.method s(Lde/i;)V
    .locals 3

    invoke-direct {p0, p1}, Lzd/q2;->k(Lde/i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd/q2;->c:Lfe/f;

    invoke-interface {v0}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lzd/m2;

    invoke-direct {v2, p0, p1}, Lzd/m2;-><init>(Lzd/q2;Lde/i;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    const-string v0, "fiam_impression"

    invoke-direct {p0, p1}, Lzd/q2;->j(Lde/i;)Z

    move-result v1

    invoke-direct {p0, p1, v0, v1}, Lzd/q2;->r(Lde/i;Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lzd/q2;->f:Lzd/s;

    invoke-virtual {v0, p1}, Lzd/s;->f(Lde/i;)V

    return-void
.end method

.method t(Lde/i;Lde/a;)V
    .locals 3

    invoke-direct {p0, p1}, Lzd/q2;->k(Lde/i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd/q2;->c:Lfe/f;

    invoke-interface {v0}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lzd/n2;

    invoke-direct {v2, p0, p1}, Lzd/n2;-><init>(Lzd/q2;Lde/i;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    const-string v0, "fiam_action"

    const/4 v1, 0x1

    invoke-direct {p0, p1, v0, v1}, Lzd/q2;->r(Lde/i;Ljava/lang/String;Z)V

    :cond_0
    iget-object v0, p0, Lzd/q2;->f:Lzd/s;

    invoke-virtual {v0, p1, p2}, Lzd/s;->k(Lde/i;Lde/a;)V

    return-void
.end method

.method u(Lde/i;Lqd/t$b;)V
    .locals 3

    invoke-direct {p0, p1}, Lzd/q2;->k(Lde/i;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lzd/q2;->c:Lfe/f;

    invoke-interface {v0}, Lfe/f;->getId()Lcom/google/android/gms/tasks/Task;

    move-result-object v0

    iget-object v1, p0, Lzd/q2;->g:Ljava/util/concurrent/Executor;

    new-instance v2, Lzd/p2;

    invoke-direct {v2, p0, p1, p2}, Lzd/p2;-><init>(Lzd/q2;Lde/i;Lqd/t$b;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/tasks/Task;->addOnSuccessListener(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/OnSuccessListener;)Lcom/google/android/gms/tasks/Task;

    :cond_0
    iget-object v0, p0, Lzd/q2;->f:Lzd/s;

    invoke-virtual {v0, p1, p2}, Lzd/s;->e(Lde/i;Lqd/t$b;)V

    return-void
.end method
