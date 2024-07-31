.class public final Lse/h;
.super Lcom/google/firebase/perf/application/b;
.source "SourceFile"

# interfaces
.implements Lve/b;


# static fields
.field private static final t:Lre/a;


# instance fields
.field private final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lve/a;",
            ">;"
        }
    .end annotation
.end field

.field private final b:Lcom/google/firebase/perf/session/gauges/GaugeManager;

.field private final c:Lwe/k;

.field private final d:Lxe/h$b;

.field private final e:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lve/b;",
            ">;"
        }
    .end annotation
.end field

.field private f:Ljava/lang/String;

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lre/a;->e()Lre/a;

    move-result-object v0

    sput-object v0, Lse/h;->t:Lre/a;

    return-void
.end method

.method private constructor <init>(Lwe/k;)V
    .locals 2

    invoke-static {}, Lcom/google/firebase/perf/application/a;->b()Lcom/google/firebase/perf/application/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->getInstance()Lcom/google/firebase/perf/session/gauges/GaugeManager;

    move-result-object v1

    invoke-direct {p0, p1, v0, v1}, Lse/h;-><init>(Lwe/k;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V

    return-void
.end method

.method public constructor <init>(Lwe/k;Lcom/google/firebase/perf/application/a;Lcom/google/firebase/perf/session/gauges/GaugeManager;)V
    .locals 0

    invoke-direct {p0, p2}, Lcom/google/firebase/perf/application/b;-><init>(Lcom/google/firebase/perf/application/a;)V

    invoke-static {}, Lxe/h;->P0()Lxe/h$b;

    move-result-object p2

    iput-object p2, p0, Lse/h;->d:Lxe/h$b;

    new-instance p2, Ljava/lang/ref/WeakReference;

    invoke-direct {p2, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object p2, p0, Lse/h;->e:Ljava/lang/ref/WeakReference;

    iput-object p1, p0, Lse/h;->c:Lwe/k;

    iput-object p3, p0, Lse/h;->b:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    invoke-static {p1}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    iput-object p1, p0, Lse/h;->a:Ljava/util/List;

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->registerForAppState()V

    return-void
.end method

.method public static c(Lwe/k;)Lse/h;
    .locals 1

    new-instance v0, Lse/h;

    invoke-direct {v0, p0}, Lse/h;-><init>(Lwe/k;)V

    return-object v0
.end method

.method private h()Z
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->N()Z

    move-result v0

    return v0
.end method

.method private i()Z
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->P()Z

    move-result v0

    return v0
.end method

.method private static j(Ljava/lang/String;)Z
    .locals 4

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    const/16 v1, 0x80

    const/4 v2, 0x0

    if-le v0, v1, :cond_0

    return v2

    :cond_0
    move v0, v2

    :goto_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    if-ge v0, v1, :cond_3

    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result v1

    const/16 v3, 0x1f

    if-le v1, v3, :cond_2

    const/16 v3, 0x7f

    if-le v1, v3, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_2
    :goto_1
    return v2

    :cond_3
    const/4 p0, 0x1

    return p0
.end method


# virtual methods
.method public a(Lve/a;)V
    .locals 1

    if-nez p1, :cond_0

    sget-object p1, Lse/h;->t:Lre/a;

    const-string v0, "Unable to add new SessionId to the Network Trace. Continuing without it."

    invoke-virtual {p1, v0}, Lre/a;->j(Ljava/lang/String;)V

    return-void

    :cond_0
    invoke-direct {p0}, Lse/h;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-direct {p0}, Lse/h;->i()Z

    move-result v0

    if-nez v0, :cond_1

    iget-object v0, p0, Lse/h;->a:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :cond_1
    return-void
.end method

.method public b()Lxe/h;
    .locals 3

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    iget-object v1, p0, Lse/h;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0, v1}, Lcom/google/firebase/perf/session/SessionManager;->unregisterForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->unregisterForAppState()V

    invoke-virtual {p0}, Lse/h;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lve/a;->b(Ljava/util/List;)[Lxe/k;

    move-result-object v0

    if-eqz v0, :cond_0

    iget-object v1, p0, Lse/h;->d:Lxe/h$b;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lxe/h$b;->I(Ljava/lang/Iterable;)Lxe/h$b;

    :cond_0
    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lcom/google/protobuf/x$a;->w()Lcom/google/protobuf/x;

    move-result-object v0

    check-cast v0, Lxe/h;

    iget-object v1, p0, Lse/h;->f:Ljava/lang/String;

    invoke-static {v1}, Lue/d;->c(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    sget-object v1, Lse/h;->t:Lre/a;

    const-string v2, "Dropping network request from a \'User-Agent\' that is not allowed"

    invoke-virtual {v1, v2}, Lre/a;->a(Ljava/lang/String;)V

    return-object v0

    :cond_1
    iget-boolean v1, p0, Lse/h;->r:Z

    if-nez v1, :cond_2

    iget-object v1, p0, Lse/h;->c:Lwe/k;

    invoke-virtual {p0}, Lcom/google/firebase/perf/application/b;->getAppState()Lxe/d;

    move-result-object v2

    invoke-virtual {v1, v0, v2}, Lwe/k;->B(Lxe/h;Lxe/d;)V

    const/4 v1, 0x1

    iput-boolean v1, p0, Lse/h;->r:Z

    return-object v0

    :cond_2
    iget-boolean v1, p0, Lse/h;->s:Z

    if-eqz v1, :cond_3

    sget-object v1, Lse/h;->t:Lre/a;

    const-string v2, "This metric has already been queued for transmission.  Please create a new HttpMetric for each request/response"

    invoke-virtual {v1, v2}, Lre/a;->a(Ljava/lang/String;)V

    :cond_3
    return-object v0
.end method

.method d()Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lve/a;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lse/h;->a:Ljava/util/List;

    monitor-enter v0

    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lse/h;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lve/a;

    if-eqz v3, :cond_0

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

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

.method public e()J
    .locals 2

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->L()J

    move-result-wide v0

    return-wide v0
.end method

.method public f()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->M()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public g()Z
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->O()Z

    move-result v0

    return v0
.end method

.method public k(Ljava/util/Map;)Lse/h;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lse/h;"
        }
    .end annotation

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0}, Lxe/h$b;->J()Lxe/h$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxe/h$b;->R(Ljava/util/Map;)Lxe/h$b;

    return-object p0
.end method

.method public l(Ljava/lang/String;)Lse/h;
    .locals 2

    if-eqz p1, :cond_9

    sget-object v0, Lxe/h$d;->HTTP_METHOD_UNKNOWN:Lxe/h$d;

    invoke-virtual {p1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/4 v1, -0x1

    sparse-switch v0, :sswitch_data_0

    goto/16 :goto_0

    :sswitch_0
    const-string v0, "DELETE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_0

    goto/16 :goto_0

    :cond_0
    const/16 v1, 0x8

    goto/16 :goto_0

    :sswitch_1
    const-string v0, "CONNECT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    goto :goto_0

    :sswitch_2
    const-string v0, "TRACE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_2

    goto :goto_0

    :cond_2
    const/4 v1, 0x6

    goto :goto_0

    :sswitch_3
    const-string v0, "PATCH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    const/4 v1, 0x5

    goto :goto_0

    :sswitch_4
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4

    goto :goto_0

    :cond_4
    const/4 v1, 0x4

    goto :goto_0

    :sswitch_5
    const-string v0, "HEAD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_5

    goto :goto_0

    :cond_5
    const/4 v1, 0x3

    goto :goto_0

    :sswitch_6
    const-string v0, "PUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    goto :goto_0

    :cond_6
    const/4 v1, 0x2

    goto :goto_0

    :sswitch_7
    const-string v0, "GET"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_7

    goto :goto_0

    :cond_7
    const/4 v1, 0x1

    goto :goto_0

    :sswitch_8
    const-string v0, "OPTIONS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_0

    :cond_8
    const/4 v1, 0x0

    :goto_0
    packed-switch v1, :pswitch_data_0

    sget-object p1, Lxe/h$d;->HTTP_METHOD_UNKNOWN:Lxe/h$d;

    goto :goto_1

    :pswitch_0
    sget-object p1, Lxe/h$d;->DELETE:Lxe/h$d;

    goto :goto_1

    :pswitch_1
    sget-object p1, Lxe/h$d;->CONNECT:Lxe/h$d;

    goto :goto_1

    :pswitch_2
    sget-object p1, Lxe/h$d;->TRACE:Lxe/h$d;

    goto :goto_1

    :pswitch_3
    sget-object p1, Lxe/h$d;->PATCH:Lxe/h$d;

    goto :goto_1

    :pswitch_4
    sget-object p1, Lxe/h$d;->POST:Lxe/h$d;

    goto :goto_1

    :pswitch_5
    sget-object p1, Lxe/h$d;->HEAD:Lxe/h$d;

    goto :goto_1

    :pswitch_6
    sget-object p1, Lxe/h$d;->PUT:Lxe/h$d;

    goto :goto_1

    :pswitch_7
    sget-object p1, Lxe/h$d;->GET:Lxe/h$d;

    goto :goto_1

    :pswitch_8
    sget-object p1, Lxe/h$d;->OPTIONS:Lxe/h$d;

    :goto_1
    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1}, Lxe/h$b;->T(Lxe/h$d;)Lxe/h$b;

    :cond_9
    return-object p0

    :sswitch_data_0
    .sparse-switch
        -0x1faded82 -> :sswitch_8
        0x11336 -> :sswitch_7
        0x136ef -> :sswitch_6
        0x21c5e0 -> :sswitch_5
        0x2590a0 -> :sswitch_4
        0x4862828 -> :sswitch_3
        0x4c5f925 -> :sswitch_2
        0x638004ca -> :sswitch_1
        0x77f979ab -> :sswitch_0
    .end sparse-switch

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public m(I)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1}, Lxe/h$b;->U(I)Lxe/h$b;

    return-object p0
.end method

.method public n()V
    .locals 1

    const/4 v0, 0x1

    iput-boolean v0, p0, Lse/h;->s:Z

    return-void
.end method

.method public o()Lse/h;
    .locals 2

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    sget-object v1, Lxe/h$e;->GENERIC_CLIENT_ERROR:Lxe/h$e;

    invoke-virtual {v0, v1}, Lxe/h$b;->V(Lxe/h$e;)Lxe/h$b;

    return-object p0
.end method

.method public p(J)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1, p2}, Lxe/h$b;->W(J)Lxe/h$b;

    return-object p0
.end method

.method public r(J)Lse/h;
    .locals 3

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v0

    invoke-virtual {v0}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Lve/a;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object v1

    iget-object v2, p0, Lse/h;->e:Ljava/lang/ref/WeakReference;

    invoke-virtual {v1, v2}, Lcom/google/firebase/perf/session/SessionManager;->registerForSessionUpdates(Ljava/lang/ref/WeakReference;)V

    iget-object v1, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v1, p1, p2}, Lxe/h$b;->S(J)Lxe/h$b;

    invoke-virtual {p0, v0}, Lse/h;->a(Lve/a;)V

    invoke-virtual {v0}, Lve/a;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lse/h;->b:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-virtual {v0}, Lve/a;->d()Lcom/google/firebase/perf/util/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(Lcom/google/firebase/perf/util/l;)V

    :cond_0
    return-object p0
.end method

.method public s(Ljava/lang/String;)Lse/h;
    .locals 3

    if-nez p1, :cond_0

    iget-object p1, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {p1}, Lxe/h$b;->K()Lxe/h$b;

    return-object p0

    :cond_0
    invoke-static {p1}, Lse/h;->j(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1}, Lxe/h$b;->X(Ljava/lang/String;)Lxe/h$b;

    goto :goto_0

    :cond_1
    sget-object v0, Lse/h;->t:Lre/a;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "The content type of the response is not a valid content-type:"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lre/a;->j(Ljava/lang/String;)V

    :goto_0
    return-object p0
.end method

.method public t(J)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1, p2}, Lxe/h$b;->Y(J)Lxe/h$b;

    return-object p0
.end method

.method public u(J)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1, p2}, Lxe/h$b;->Z(J)Lxe/h$b;

    return-object p0
.end method

.method public v(J)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1, p2}, Lxe/h$b;->b0(J)Lxe/h$b;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Lve/a;

    move-result-object p1

    invoke-virtual {p1}, Lve/a;->e()Z

    move-result p1

    if-eqz p1, :cond_0

    iget-object p1, p0, Lse/h;->b:Lcom/google/firebase/perf/session/gauges/GaugeManager;

    invoke-static {}, Lcom/google/firebase/perf/session/SessionManager;->getInstance()Lcom/google/firebase/perf/session/SessionManager;

    move-result-object p2

    invoke-virtual {p2}, Lcom/google/firebase/perf/session/SessionManager;->perfSession()Lve/a;

    move-result-object p2

    invoke-virtual {p2}, Lve/a;->d()Lcom/google/firebase/perf/util/l;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/google/firebase/perf/session/gauges/GaugeManager;->collectGaugeMetricOnce(Lcom/google/firebase/perf/util/l;)V

    :cond_0
    return-object p0
.end method

.method public w(J)Lse/h;
    .locals 1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    invoke-virtual {v0, p1, p2}, Lxe/h$b;->d0(J)Lxe/h$b;

    return-object p0
.end method

.method public x(Ljava/lang/String;)Lse/h;
    .locals 2

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/google/firebase/perf/util/o;->d(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iget-object v0, p0, Lse/h;->d:Lxe/h$b;

    const/16 v1, 0x7d0

    invoke-static {p1, v1}, Lcom/google/firebase/perf/util/o;->e(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxe/h$b;->e0(Ljava/lang/String;)Lxe/h$b;

    :cond_0
    return-object p0
.end method

.method public y(Ljava/lang/String;)Lse/h;
    .locals 0

    iput-object p1, p0, Lse/h;->f:Ljava/lang/String;

    return-object p0
.end method
