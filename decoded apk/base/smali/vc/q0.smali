.class public Lvc/q0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:Lvc/t;

.field private final b:Lad/e;

.field private final c:Lbd/b;

.field private final d:Lwc/e;

.field private final e:Lwc/n;

.field private final f:Lvc/b0;


# direct methods
.method constructor <init>(Lvc/t;Lad/e;Lbd/b;Lwc/e;Lwc/n;Lvc/b0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvc/q0;->a:Lvc/t;

    iput-object p2, p0, Lvc/q0;->b:Lad/e;

    iput-object p3, p0, Lvc/q0;->c:Lbd/b;

    iput-object p4, p0, Lvc/q0;->d:Lwc/e;

    iput-object p5, p0, Lvc/q0;->e:Lwc/n;

    iput-object p6, p0, Lvc/q0;->f:Lvc/b0;

    return-void
.end method

.method public static synthetic a(Lvc/q0;Lcom/google/android/gms/tasks/Task;)Z
    .locals 0

    invoke-direct {p0, p1}, Lvc/q0;->r(Lcom/google/android/gms/tasks/Task;)Z

    move-result p0

    return p0
.end method

.method public static synthetic b(Lxc/f0$c;Lxc/f0$c;)I
    .locals 0

    invoke-static {p0, p1}, Lvc/q0;->o(Lxc/f0$c;Lxc/f0$c;)I

    move-result p0

    return p0
.end method

.method private c(Lxc/f0$e$d;Lwc/e;Lwc/n;)Lxc/f0$e$d;
    .locals 2

    invoke-virtual {p1}, Lxc/f0$e$d;->h()Lxc/f0$e$d$b;

    move-result-object v0

    invoke-virtual {p2}, Lwc/e;->c()Ljava/lang/String;

    move-result-object p2

    if-eqz p2, :cond_0

    invoke-static {}, Lxc/f0$e$d$d;->a()Lxc/f0$e$d$d$a;

    move-result-object v1

    invoke-virtual {v1, p2}, Lxc/f0$e$d$d$a;->b(Ljava/lang/String;)Lxc/f0$e$d$d$a;

    move-result-object p2

    invoke-virtual {p2}, Lxc/f0$e$d$d$a;->a()Lxc/f0$e$d$d;

    move-result-object p2

    invoke-virtual {v0, p2}, Lxc/f0$e$d$b;->d(Lxc/f0$e$d$d;)Lxc/f0$e$d$b;

    goto :goto_0

    :cond_0
    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p2

    const-string v1, "No log data to include with this event."

    invoke-virtual {p2, v1}, Lsc/g;->i(Ljava/lang/String;)V

    :goto_0
    invoke-virtual {p3}, Lwc/n;->f()Ljava/util/Map;

    move-result-object p2

    invoke-static {p2}, Lvc/q0;->m(Ljava/util/Map;)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p3}, Lwc/n;->g()Ljava/util/Map;

    move-result-object p3

    invoke-static {p3}, Lvc/q0;->m(Ljava/util/Map;)Ljava/util/List;

    move-result-object p3

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p3}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2

    :cond_1
    invoke-virtual {p1}, Lxc/f0$e$d;->b()Lxc/f0$e$d$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a;->i()Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$a;->e(Ljava/util/List;)Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lxc/f0$e$d$a$a;->g(Ljava/util/List;)Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$a;->a()Lxc/f0$e$d$a;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$e$d$b;->b(Lxc/f0$e$d$a;)Lxc/f0$e$d$b;

    :cond_2
    invoke-virtual {v0}, Lxc/f0$e$d$b;->a()Lxc/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method private d(Lxc/f0$e$d;)Lxc/f0$e$d;
    .locals 2

    iget-object v0, p0, Lvc/q0;->d:Lwc/e;

    iget-object v1, p0, Lvc/q0;->e:Lwc/n;

    invoke-direct {p0, p1, v0, v1}, Lvc/q0;->c(Lxc/f0$e$d;Lwc/e;Lwc/n;)Lxc/f0$e$d;

    move-result-object p1

    iget-object v0, p0, Lvc/q0;->e:Lwc/n;

    invoke-direct {p0, p1, v0}, Lvc/q0;->e(Lxc/f0$e$d;Lwc/n;)Lxc/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method private e(Lxc/f0$e$d;Lwc/n;)Lxc/f0$e$d;
    .locals 1

    invoke-virtual {p2}, Lwc/n;->h()Ljava/util/List;

    move-result-object p2

    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    return-object p1

    :cond_0
    invoke-virtual {p1}, Lxc/f0$e$d;->h()Lxc/f0$e$d$b;

    move-result-object p1

    invoke-static {}, Lxc/f0$e$d$f;->a()Lxc/f0$e$d$f$a;

    move-result-object v0

    invoke-virtual {v0, p2}, Lxc/f0$e$d$f$a;->b(Ljava/util/List;)Lxc/f0$e$d$f$a;

    move-result-object p2

    invoke-virtual {p2}, Lxc/f0$e$d$f$a;->a()Lxc/f0$e$d$f;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$b;->e(Lxc/f0$e$d$f;)Lxc/f0$e$d$b;

    invoke-virtual {p1}, Lxc/f0$e$d$b;->a()Lxc/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method private static f(Landroid/app/ApplicationExitInfo;)Lxc/f0$a;
    .locals 5

    const/4 v0, 0x0

    :try_start_0
    invoke-static {p0}, Lvc/h0;->a(Landroid/app/ApplicationExitInfo;)Ljava/io/InputStream;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-static {v1}, Lvc/q0;->g(Ljava/io/InputStream;)Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception v1

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Could not get input trace in application exit info: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-static {p0}, Lvc/i0;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " Error: "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2, v1}, Lsc/g;->k(Ljava/lang/String;)V

    :cond_0
    :goto_0
    invoke-static {}, Lxc/f0$a;->a()Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Lvc/j0;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->c(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Lvc/k0;->a(Landroid/app/ApplicationExitInfo;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->e(Ljava/lang/String;)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Ll2/g;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->g(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Ll2/h;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->i(J)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Lvc/l0;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->d(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Lvc/m0;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->f(J)Lxc/f0$a$b;

    move-result-object v1

    invoke-static {p0}, Lvc/n0;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->h(J)Lxc/f0$a$b;

    move-result-object p0

    invoke-virtual {p0, v0}, Lxc/f0$a$b;->j(Ljava/lang/String;)Lxc/f0$a$b;

    move-result-object p0

    invoke-virtual {p0}, Lxc/f0$a$b;->a()Lxc/f0$a;

    move-result-object p0

    return-object p0
.end method

.method public static g(Ljava/io/InputStream;)Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    const/16 v1, 0x2000

    new-array v1, v1, [B

    :goto_0
    invoke-virtual {p0, v1}, Ljava/io/InputStream;->read([B)I

    move-result v2

    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v3, v2}, Ljava/io/ByteArrayOutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    sget-object p0, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    invoke-virtual {p0}, Ljava/nio/charset/Charset;->name()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/io/ByteArrayOutputStream;->toString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static h(Landroid/content/Context;Lvc/b0;Lad/f;Lvc/a;Lwc/e;Lwc/n;Ldd/d;Lcd/i;Lvc/g0;Lvc/m;)Lvc/q0;
    .locals 9

    move-object/from16 v6, p7

    new-instance v7, Lvc/t;

    move-object v0, v7

    move-object v1, p0

    move-object v2, p1

    move-object v3, p3

    move-object v4, p6

    move-object/from16 v5, p7

    invoke-direct/range {v0 .. v5}, Lvc/t;-><init>(Landroid/content/Context;Lvc/b0;Lvc/a;Ldd/d;Lcd/i;)V

    new-instance v2, Lad/e;

    move-object v0, p2

    move-object/from16 v1, p9

    invoke-direct {v2, p2, v6, v1}, Lad/e;-><init>(Lad/f;Lcd/i;Lvc/m;)V

    move-object v0, p0

    move-object/from16 v1, p8

    invoke-static {p0, v6, v1}, Lbd/b;->b(Landroid/content/Context;Lcd/i;Lvc/g0;)Lbd/b;

    move-result-object v3

    new-instance v8, Lvc/q0;

    move-object v0, v8

    move-object v1, v7

    move-object v4, p4

    move-object v5, p5

    move-object v6, p1

    invoke-direct/range {v0 .. v6}, Lvc/q0;-><init>(Lvc/t;Lad/e;Lbd/b;Lwc/e;Lwc/n;Lvc/b0;)V

    return-object v8
.end method

.method private i(Lvc/u;)Lvc/u;
    .locals 2

    invoke-virtual {p1}, Lvc/u;->b()Lxc/f0;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0;->g()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lvc/q0;->f:Lvc/b0;

    invoke-virtual {v0}, Lvc/b0;->d()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Lvc/u;->b()Lxc/f0;

    move-result-object v1

    invoke-virtual {v1, v0}, Lxc/f0;->r(Ljava/lang/String;)Lxc/f0;

    move-result-object v0

    invoke-virtual {p1}, Lvc/u;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lvc/u;->c()Ljava/io/File;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lvc/u;->a(Lxc/f0;Ljava/lang/String;Ljava/io/File;)Lvc/u;

    move-result-object p1

    :cond_0
    return-object p1
.end method

.method private l(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;)",
            "Landroid/app/ApplicationExitInfo;"
        }
    .end annotation

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0, p1}, Lad/e;->q(Ljava/lang/String;)J

    move-result-wide v0

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    const/4 v2, 0x0

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/app/ApplicationExitInfo;

    invoke-static {p2}, Ll2/h;->a(Landroid/app/ApplicationExitInfo;)J

    move-result-wide v3

    cmp-long v3, v3, v0

    if-gez v3, :cond_0

    return-object v2

    :cond_0
    invoke-static {p2}, Ll2/g;->a(Landroid/app/ApplicationExitInfo;)I

    move-result v2

    const/4 v3, 0x6

    if-eq v2, v3, :cond_1

    goto :goto_0

    :cond_1
    return-object p2

    :cond_2
    return-object v2
.end method

.method private static m(Ljava/util/Map;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Ljava/util/List<",
            "Lxc/f0$c;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p0}, Ljava/util/Map;->size()I

    move-result v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->ensureCapacity(I)V

    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/Map$Entry;

    invoke-static {}, Lxc/f0$c;->a()Lxc/f0$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v2, v3}, Lxc/f0$c$a;->b(Ljava/lang/String;)Lxc/f0$c$a;

    move-result-object v2

    invoke-interface {v1}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v2, v1}, Lxc/f0$c$a;->c(Ljava/lang/String;)Lxc/f0$c$a;

    move-result-object v1

    invoke-virtual {v1}, Lxc/f0$c$a;->a()Lxc/f0$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    new-instance p0, Lvc/o0;

    invoke-direct {p0}, Lvc/o0;-><init>()V

    invoke-static {v0, p0}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic o(Lxc/f0$c;Lxc/f0$c;)I
    .locals 0

    invoke-virtual {p0}, Lxc/f0$c;->b()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1}, Lxc/f0$c;->b()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    move-result p0

    return p0
.end method

.method private r(Lcom/google/android/gms/tasks/Task;)Z
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/google/android/gms/tasks/Task<",
            "Lvc/u;",
            ">;)Z"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->isSuccessful()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getResult()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lvc/u;

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics report successfully enqueued to DataTransport: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Lvc/u;->d()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    invoke-virtual {p1}, Lvc/u;->c()Ljava/io/File;

    move-result-object p1

    invoke-virtual {p1}, Ljava/io/File;->delete()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Deleted report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsc/g;->b(Ljava/lang/String;)V

    goto :goto_0

    :cond_0
    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Crashlytics could not delete report file: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lsc/g;->k(Ljava/lang/String;)V

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_1
    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "Crashlytics report could not be enqueued to DataTransport"

    invoke-virtual {p1}, Lcom/google/android/gms/tasks/Task;->getException()Ljava/lang/Exception;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Lsc/g;->l(Ljava/lang/String;Ljava/lang/Throwable;)V

    const/4 p1, 0x0

    return p1
.end method

.method private s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V
    .locals 11

    move-object v0, p0

    const-string v1, "crash"

    move-object v5, p4

    invoke-virtual {p4, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    iget-object v2, v0, Lvc/q0;->a:Lvc/t;

    const/4 v8, 0x4

    const/16 v9, 0x8

    move-object v3, p1

    move-object v4, p2

    move-wide/from16 v6, p5

    move/from16 v10, p7

    invoke-virtual/range {v2 .. v10}, Lvc/t;->d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Lxc/f0$e$d;

    move-result-object v2

    iget-object v3, v0, Lvc/q0;->b:Lad/e;

    invoke-direct {p0, v2}, Lvc/q0;->d(Lxc/f0$e$d;)Lxc/f0$e$d;

    move-result-object v2

    move-object v4, p3

    invoke-virtual {v3, v2, p3, v1}, Lad/e;->y(Lxc/f0$e$d;Ljava/lang/String;Z)V

    return-void
.end method


# virtual methods
.method public j(Ljava/lang/String;Ljava/util/List;Lxc/f0$a;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lvc/e0;",
            ">;",
            "Lxc/f0$a;",
            ")V"
        }
    .end annotation

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    const-string v1, "SessionReportingCoordinator#finalizeSessionWithNativeEvent"

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lvc/e0;

    invoke-interface {v1}, Lvc/e0;->a()Lxc/f0$d$b;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    iget-object p2, p0, Lvc/q0;->b:Lad/e;

    invoke-static {}, Lxc/f0$d;->a()Lxc/f0$d$a;

    move-result-object v1

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v1, v0}, Lxc/f0$d$a;->b(Ljava/util/List;)Lxc/f0$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$d$a;->a()Lxc/f0$d;

    move-result-object v0

    invoke-virtual {p2, p1, v0, p3}, Lad/e;->l(Ljava/lang/String;Lxc/f0$d;Lxc/f0$a;)V

    return-void
.end method

.method public k(JLjava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0, p3, p1, p2}, Lad/e;->k(Ljava/lang/String;J)V

    return-void
.end method

.method public n()Z
    .locals 1

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0}, Lad/e;->r()Z

    move-result v0

    return v0
.end method

.method public p()Ljava/util/SortedSet;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/SortedSet<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0}, Lad/e;->p()Ljava/util/SortedSet;

    move-result-object v0

    return-object v0
.end method

.method public q(Ljava/lang/String;J)V
    .locals 1

    iget-object v0, p0, Lvc/q0;->a:Lvc/t;

    invoke-virtual {v0, p1, p2, p3}, Lvc/t;->e(Ljava/lang/String;J)Lxc/f0;

    move-result-object p1

    iget-object p2, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {p2, p1}, Lad/e;->z(Lxc/f0;)V

    return-void
.end method

.method public t(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsc/g;->i(Ljava/lang/String;)V

    const-string v6, "crash"

    const/4 v9, 0x1

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-direct/range {v2 .. v9}, Lvc/q0;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public u(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;J)V
    .locals 10

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting non-fatal event for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsc/g;->i(Ljava/lang/String;)V

    const-string v6, "error"

    const/4 v9, 0x0

    move-object v2, p0

    move-object v3, p1

    move-object v4, p2

    move-object v5, p3

    move-wide v7, p4

    invoke-direct/range {v2 .. v9}, Lvc/q0;->s(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;Ljava/lang/String;JZ)V

    return-void
.end method

.method public v(Ljava/lang/String;Ljava/util/List;Lwc/e;Lwc/n;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Landroid/app/ApplicationExitInfo;",
            ">;",
            "Lwc/e;",
            "Lwc/n;",
            ")V"
        }
    .end annotation

    invoke-direct {p0, p1, p2}, Lvc/q0;->l(Ljava/lang/String;Ljava/util/List;)Landroid/app/ApplicationExitInfo;

    move-result-object p2

    if-nez p2, :cond_0

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object p2

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    const-string p4, "No relevant ApplicationExitInfo occurred during session: "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lsc/g;->i(Ljava/lang/String;)V

    return-void

    :cond_0
    iget-object v0, p0, Lvc/q0;->a:Lvc/t;

    invoke-static {p2}, Lvc/q0;->f(Landroid/app/ApplicationExitInfo;)Lxc/f0$a;

    move-result-object p2

    invoke-virtual {v0, p2}, Lvc/t;->c(Lxc/f0$a;)Lxc/f0$e$d;

    move-result-object p2

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "Persisting anr for session "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    invoke-direct {p0, p2, p3, p4}, Lvc/q0;->c(Lxc/f0$e$d;Lwc/e;Lwc/n;)Lxc/f0$e$d;

    move-result-object p2

    invoke-direct {p0, p2, p4}, Lvc/q0;->e(Lxc/f0$e$d;Lwc/n;)Lxc/f0$e$d;

    move-result-object p2

    iget-object p3, p0, Lvc/q0;->b:Lad/e;

    const/4 p4, 0x1

    invoke-virtual {p3, p2, p1, p4}, Lad/e;->y(Lxc/f0$e$d;Ljava/lang/String;Z)V

    return-void
.end method

.method public w()V
    .locals 1

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0}, Lad/e;->i()V

    return-void
.end method

.method public x(Ljava/util/concurrent/Executor;)Lcom/google/android/gms/tasks/Task;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    const/4 v0, 0x0

    invoke-virtual {p0, p1, v0}, Lvc/q0;->y(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method

.method public y(Ljava/util/concurrent/Executor;Ljava/lang/String;)Lcom/google/android/gms/tasks/Task;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/Executor;",
            "Ljava/lang/String;",
            ")",
            "Lcom/google/android/gms/tasks/Task<",
            "Ljava/lang/Void;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lvc/q0;->b:Lad/e;

    invoke-virtual {v0}, Lad/e;->w()Ljava/util/List;

    move-result-object v0

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvc/u;

    if-eqz p2, :cond_1

    invoke-virtual {v2}, Lvc/u;->d()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_1
    iget-object v3, p0, Lvc/q0;->c:Lbd/b;

    invoke-direct {p0, v2}, Lvc/q0;->i(Lvc/u;)Lvc/u;

    move-result-object v2

    if-eqz p2, :cond_2

    const/4 v4, 0x1

    goto :goto_1

    :cond_2
    const/4 v4, 0x0

    :goto_1
    invoke-virtual {v3, v2, v4}, Lbd/b;->c(Lvc/u;Z)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    new-instance v3, Lvc/p0;

    invoke-direct {v3, p0}, Lvc/p0;-><init>(Lvc/q0;)V

    invoke-virtual {v2, p1, v3}, Lcom/google/android/gms/tasks/Task;->continueWith(Ljava/util/concurrent/Executor;Lcom/google/android/gms/tasks/Continuation;)Lcom/google/android/gms/tasks/Task;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v1}, Lcom/google/android/gms/tasks/Tasks;->whenAll(Ljava/util/Collection;)Lcom/google/android/gms/tasks/Task;

    move-result-object p1

    return-object p1
.end method
