.class public Lvc/t;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final g:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;"
        }
    .end annotation
.end field

.field static final h:Ljava/lang/String;


# instance fields
.field private final a:Landroid/content/Context;

.field private final b:Lvc/b0;

.field private final c:Lvc/a;

.field private final d:Ldd/d;

.field private final e:Lcd/i;

.field private final f:Lsc/i;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    sput-object v0, Lvc/t;->g:Ljava/util/Map;

    const/4 v1, 0x5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "armeabi-v7a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/16 v1, 0x9

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    const-string v2, "arm64-v8a"

    invoke-interface {v0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    const-string v3, "x86"

    invoke-interface {v0, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v2, 0x1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    const-string v4, "x86_64"

    invoke-interface {v0, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    new-array v2, v2, [Ljava/lang/Object;

    const-string v3, "18.6.0"

    aput-object v3, v2, v1

    const-string v1, "Crashlytics Android SDK/%s"

    invoke-static {v0, v1, v2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    sput-object v0, Lvc/t;->h:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lvc/b0;Lvc/a;Ldd/d;Lcd/i;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lsc/i;->a:Lsc/i;

    iput-object v0, p0, Lvc/t;->f:Lsc/i;

    iput-object p1, p0, Lvc/t;->a:Landroid/content/Context;

    iput-object p2, p0, Lvc/t;->b:Lvc/b0;

    iput-object p3, p0, Lvc/t;->c:Lvc/a;

    iput-object p4, p0, Lvc/t;->d:Ldd/d;

    iput-object p5, p0, Lvc/t;->e:Lcd/i;

    return-void
.end method

.method private A(Lxc/f0$a;)Lxc/f0$e$d$a$c;
    .locals 3

    iget-object v0, p0, Lvc/t;->f:Lsc/i;

    invoke-virtual {p1}, Lxc/f0$a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->d()I

    move-result v2

    invoke-virtual {p1}, Lxc/f0$a;->c()I

    move-result p1

    invoke-virtual {v0, v1, v2, p1}, Lsc/i;->a(Ljava/lang/String;II)Lxc/f0$e$d$a$c;

    move-result-object p1

    return-object p1
.end method

.method private a(Lxc/f0$a;)Lxc/f0$a;
    .locals 5

    iget-object v0, p0, Lvc/t;->e:Lcd/i;

    invoke-interface {v0}, Lcd/i;->b()Lcd/d;

    move-result-object v0

    iget-object v0, v0, Lcd/d;->b:Lcd/d$a;

    iget-boolean v0, v0, Lcd/d$a;->c:Z

    if-eqz v0, :cond_1

    iget-object v0, p0, Lvc/t;->c:Lvc/a;

    iget-object v0, v0, Lvc/a;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->c:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lvc/f;

    invoke-static {}, Lxc/f0$a$a;->a()Lxc/f0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lvc/f;->c()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lxc/f0$a$a$a;->d(Ljava/lang/String;)Lxc/f0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lvc/f;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Lxc/f0$a$a$a;->b(Ljava/lang/String;)Lxc/f0$a$a$a;

    move-result-object v3

    invoke-virtual {v2}, Lvc/f;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Lxc/f0$a$a$a;->c(Ljava/lang/String;)Lxc/f0$a$a$a;

    move-result-object v2

    invoke-virtual {v2}, Lxc/f0$a$a$a;->a()Lxc/f0$a$a;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    :goto_1
    invoke-static {}, Lxc/f0$a;->a()Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->c()I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->c(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->e()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->e(Ljava/lang/String;)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->g()I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->g(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->i(J)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->d()I

    move-result v2

    invoke-virtual {v1, v2}, Lxc/f0$a$b;->d(I)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->f()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->f(J)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->h()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$a$b;->h(J)Lxc/f0$a$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->j()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lxc/f0$a$b;->j(Ljava/lang/String;)Lxc/f0$a$b;

    move-result-object p1

    invoke-virtual {p1, v0}, Lxc/f0$a$b;->b(Ljava/util/List;)Lxc/f0$a$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$a$b;->a()Lxc/f0$a;

    move-result-object p1

    return-object p1
.end method

.method private b()Lxc/f0$b;
    .locals 2

    invoke-static {}, Lxc/f0;->b()Lxc/f0$b;

    move-result-object v0

    const-string v1, "18.6.0"

    invoke-virtual {v0, v1}, Lxc/f0$b;->k(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->a:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$b;->g(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->b:Lvc/b0;

    invoke-virtual {v1}, Lvc/b0;->a()Lvc/c0$a;

    move-result-object v1

    invoke-virtual {v1}, Lvc/c0$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$b;->h(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->b:Lvc/b0;

    invoke-virtual {v1}, Lvc/b0;->a()Lvc/c0$a;

    move-result-object v1

    invoke-virtual {v1}, Lvc/c0$a;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$b;->f(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$b;->d(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$b;->e(Ljava/lang/String;)Lxc/f0$b;

    move-result-object v0

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lxc/f0$b;->j(I)Lxc/f0$b;

    move-result-object v0

    return-object v0
.end method

.method private static f(J)J
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v2, p0, v0

    if-lez v2, :cond_0

    goto :goto_0

    :cond_0
    move-wide p0, v0

    :goto_0
    return-wide p0
.end method

.method private static g()I
    .locals 4

    sget-object v0, Landroid/os/Build;->CPU_ABI:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    const/4 v2, 0x7

    if-eqz v1, :cond_0

    return v2

    :cond_0
    sget-object v1, Lvc/t;->g:Ljava/util/Map;

    sget-object v3, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Integer;

    if-nez v0, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    return v0
.end method

.method private h()Lxc/f0$e$d$a$b$a;
    .locals 3

    invoke-static {}, Lxc/f0$e$d$a$b$a;->a()Lxc/f0$e$d$a$b$a$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lxc/f0$e$d$a$b$a$a;->b(J)Lxc/f0$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0, v1, v2}, Lxc/f0$e$d$a$b$a$a;->d(J)Lxc/f0$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->e:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$a$a;->c(Ljava/lang/String;)Lxc/f0$e$d$a$b$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$a$a;->e(Ljava/lang/String;)Lxc/f0$e$d$a$b$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$d$a$b$a$a;->a()Lxc/f0$e$d$a$b$a;

    move-result-object v0

    return-object v0
.end method

.method private i()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lxc/f0$e$d$a$b$a;",
            ">;"
        }
    .end annotation

    invoke-direct {p0}, Lvc/t;->h()Lxc/f0$e$d$a$b$a;

    move-result-object v0

    invoke-static {v0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    return-object v0
.end method

.method private j(ILdd/e;Ljava/lang/Thread;IIZ)Lxc/f0$e$d$a;
    .locals 6

    iget-object v0, p0, Lvc/t;->f:Lsc/i;

    iget-object v1, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-virtual {v0, v1}, Lsc/i;->e(Landroid/content/Context;)Lxc/f0$e$d$a$c;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$d$a$c;->b()I

    move-result v1

    if-lez v1, :cond_1

    invoke-virtual {v0}, Lxc/f0$e$d$a$c;->b()I

    move-result v1

    const/16 v2, 0x64

    if-eq v1, v2, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-static {v1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    invoke-static {}, Lxc/f0$e$d$a;->a()Lxc/f0$e$d$a$a;

    move-result-object v2

    invoke-virtual {v2, v1}, Lxc/f0$e$d$a$a;->c(Ljava/lang/Boolean;)Lxc/f0$e$d$a$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lxc/f0$e$d$a$a;->d(Lxc/f0$e$d$a$c;)Lxc/f0$e$d$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->f:Lsc/i;

    iget-object v2, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-virtual {v1, v2}, Lsc/i;->d(Landroid/content/Context;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$a;->b(Ljava/util/List;)Lxc/f0$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$d$a$a;->h(I)Lxc/f0$e$d$a$a;

    move-result-object p1

    move-object v0, p0

    move-object v1, p2

    move-object v2, p3

    move v3, p4

    move v4, p5

    move v5, p6

    invoke-direct/range {v0 .. v5}, Lvc/t;->o(Ldd/e;Ljava/lang/Thread;IIZ)Lxc/f0$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$a;->f(Lxc/f0$e$d$a$b;)Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$a;->a()Lxc/f0$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private k(ILxc/f0$a;)Lxc/f0$e$d$a;
    .locals 2

    invoke-virtual {p2}, Lxc/f0$a;->c()I

    move-result v0

    const/16 v1, 0x64

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {}, Lxc/f0$e$d$a;->a()Lxc/f0$e$d$a$a;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-virtual {v1, v0}, Lxc/f0$e$d$a$a;->c(Ljava/lang/Boolean;)Lxc/f0$e$d$a$a;

    move-result-object v0

    invoke-direct {p0, p2}, Lvc/t;->A(Lxc/f0$a;)Lxc/f0$e$d$a$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$a;->d(Lxc/f0$e$d$a$c;)Lxc/f0$e$d$a$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$d$a$a;->h(I)Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-direct {p0, p2}, Lvc/t;->p(Lxc/f0$a;)Lxc/f0$e$d$a$b;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$a;->f(Lxc/f0$e$d$a$b;)Lxc/f0$e$d$a$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$a;->a()Lxc/f0$e$d$a;

    move-result-object p1

    return-object p1
.end method

.method private l(I)Lxc/f0$e$d$c;
    .locals 8

    iget-object v0, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-static {v0}, Lvc/e;->a(Landroid/content/Context;)Lvc/e;

    move-result-object v0

    invoke-virtual {v0}, Lvc/e;->b()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    invoke-virtual {v0}, Lvc/e;->c()I

    move-result v0

    iget-object v2, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-static {v2}, Lvc/i;->n(Landroid/content/Context;)Z

    move-result v2

    iget-object v3, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-static {v3}, Lvc/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    iget-object v5, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-static {v5}, Lvc/i;->a(Landroid/content/Context;)J

    move-result-wide v5

    sub-long/2addr v3, v5

    invoke-static {v3, v4}, Lvc/t;->f(J)J

    move-result-wide v3

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v5

    invoke-virtual {v5}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lvc/i;->c(Ljava/lang/String;)J

    move-result-wide v5

    invoke-static {}, Lxc/f0$e$d$c;->a()Lxc/f0$e$d$c$a;

    move-result-object v7

    invoke-virtual {v7, v1}, Lxc/f0$e$d$c$a;->b(Ljava/lang/Double;)Lxc/f0$e$d$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lxc/f0$e$d$c$a;->c(I)Lxc/f0$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, v2}, Lxc/f0$e$d$c$a;->f(Z)Lxc/f0$e$d$c$a;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$d$c$a;->e(I)Lxc/f0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v3, v4}, Lxc/f0$e$d$c$a;->g(J)Lxc/f0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1, v5, v6}, Lxc/f0$e$d$c$a;->d(J)Lxc/f0$e$d$c$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$c$a;->a()Lxc/f0$e$d$c;

    move-result-object p1

    return-object p1
.end method

.method private m(Ldd/e;II)Lxc/f0$e$d$a$b$c;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, p3, v0}, Lvc/t;->n(Ldd/e;III)Lxc/f0$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private n(Ldd/e;III)Lxc/f0$e$d$a$b$c;
    .locals 5

    iget-object v0, p1, Ldd/e;->b:Ljava/lang/String;

    iget-object v1, p1, Ldd/e;->a:Ljava/lang/String;

    iget-object v2, p1, Ldd/e;->c:[Ljava/lang/StackTraceElement;

    const/4 v3, 0x0

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_0
    new-array v2, v3, [Ljava/lang/StackTraceElement;

    :goto_0
    iget-object p1, p1, Ldd/e;->d:Ldd/e;

    if-lt p4, p3, :cond_1

    move-object v4, p1

    :goto_1
    if-eqz v4, :cond_1

    iget-object v4, v4, Ldd/e;->d:Ldd/e;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    invoke-static {}, Lxc/f0$e$d$a$b$c;->a()Lxc/f0$e$d$a$b$c$a;

    move-result-object v4

    invoke-virtual {v4, v0}, Lxc/f0$e$d$a$b$c$a;->f(Ljava/lang/String;)Lxc/f0$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$c$a;->e(Ljava/lang/String;)Lxc/f0$e$d$a$b$c$a;

    move-result-object v0

    invoke-direct {p0, v2, p2}, Lvc/t;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$c$a;->c(Ljava/util/List;)Lxc/f0$e$d$a$b$c$a;

    move-result-object v0

    invoke-virtual {v0, v3}, Lxc/f0$e$d$a$b$c$a;->d(I)Lxc/f0$e$d$a$b$c$a;

    move-result-object v0

    if-eqz p1, :cond_2

    if-nez v3, :cond_2

    add-int/lit8 p4, p4, 0x1

    invoke-direct {p0, p1, p2, p3, p4}, Lvc/t;->n(Ldd/e;III)Lxc/f0$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$e$d$a$b$c$a;->b(Lxc/f0$e$d$a$b$c;)Lxc/f0$e$d$a$b$c$a;

    :cond_2
    invoke-virtual {v0}, Lxc/f0$e$d$a$b$c$a;->a()Lxc/f0$e$d$a$b$c;

    move-result-object p1

    return-object p1
.end method

.method private o(Ldd/e;Ljava/lang/Thread;IIZ)Lxc/f0$e$d$a$b;
    .locals 1

    invoke-static {}, Lxc/f0$e$d$a$b;->a()Lxc/f0$e$d$a$b$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3, p5}, Lvc/t;->z(Ldd/e;Ljava/lang/Thread;IZ)Ljava/util/List;

    move-result-object p2

    invoke-virtual {v0, p2}, Lxc/f0$e$d$a$b$b;->f(Ljava/util/List;)Lxc/f0$e$d$a$b$b;

    move-result-object p2

    invoke-direct {p0, p1, p3, p4}, Lvc/t;->m(Ldd/e;II)Lxc/f0$e$d$a$b$c;

    move-result-object p1

    invoke-virtual {p2, p1}, Lxc/f0$e$d$a$b$b;->d(Lxc/f0$e$d$a$b$c;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->w()Lxc/f0$e$d$a$b$d;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$b$b;->e(Lxc/f0$e$d$a$b$d;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->i()Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$b$b;->c(Ljava/util/List;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$b;->a()Lxc/f0$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private p(Lxc/f0$a;)Lxc/f0$e$d$a$b;
    .locals 1

    invoke-static {}, Lxc/f0$e$d$a$b;->a()Lxc/f0$e$d$a$b$b;

    move-result-object v0

    invoke-virtual {v0, p1}, Lxc/f0$e$d$a$b$b;->b(Lxc/f0$a;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->w()Lxc/f0$e$d$a$b$d;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxc/f0$e$d$a$b$b;->e(Lxc/f0$e$d$a$b$d;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->i()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxc/f0$e$d$a$b$b;->c(Ljava/util/List;)Lxc/f0$e$d$a$b$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$b;->a()Lxc/f0$e$d$a$b;

    move-result-object p1

    return-object p1
.end method

.method private q(Ljava/lang/StackTraceElement;Lxc/f0$e$d$a$b$e$b$a;)Lxc/f0$e$d$a$b$e$b;
    .locals 7

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v0

    const-wide/16 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v0

    int-to-long v3, v0

    invoke-static {v3, v4, v1, v2}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    goto :goto_0

    :cond_0
    move-wide v3, v1

    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, "."

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->isNativeMethod()Z

    move-result v6

    if-nez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result v6

    if-lez v6, :cond_1

    invoke-virtual {p1}, Ljava/lang/StackTraceElement;->getLineNumber()I

    move-result p1

    int-to-long v1, p1

    :cond_1
    invoke-virtual {p2, v3, v4}, Lxc/f0$e$d$a$b$e$b$a;->e(J)Lxc/f0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v0}, Lxc/f0$e$d$a$b$e$b$a;->f(Ljava/lang/String;)Lxc/f0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v5}, Lxc/f0$e$d$a$b$e$b$a;->b(Ljava/lang/String;)Lxc/f0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1, v1, v2}, Lxc/f0$e$d$a$b$e$b$a;->d(J)Lxc/f0$e$d$a$b$e$b$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$e$b$a;->a()Lxc/f0$e$d$a$b$e$b;

    move-result-object p1

    return-object p1
.end method

.method private r([Ljava/lang/StackTraceElement;I)Ljava/util/List;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Ljava/lang/StackTraceElement;",
            "I)",
            "Ljava/util/List<",
            "Lxc/f0$e$d$a$b$e$b;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    array-length v1, p1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    aget-object v3, p1, v2

    invoke-static {}, Lxc/f0$e$d$a$b$e$b;->a()Lxc/f0$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-virtual {v4, p2}, Lxc/f0$e$d$a$b$e$b$a;->c(I)Lxc/f0$e$d$a$b$e$b$a;

    move-result-object v4

    invoke-direct {p0, v3, v4}, Lvc/t;->q(Ljava/lang/StackTraceElement;Lxc/f0$e$d$a$b$e$b$a;)Lxc/f0$e$d$a$b$e$b;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method private s()Lxc/f0$e$a;
    .locals 2

    invoke-static {}, Lxc/f0$e$a;->a()Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->b:Lvc/b0;

    invoke-virtual {v1}, Lvc/b0;->f()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->e(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->f:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->g(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->d(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->b:Lvc/b0;

    invoke-virtual {v1}, Lvc/b0;->a()Lvc/c0$a;

    move-result-object v1

    invoke-virtual {v1}, Lvc/c0$a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->f(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->h:Lsc/f;

    invoke-virtual {v1}, Lsc/f;->d()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->b(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    iget-object v1, p0, Lvc/t;->c:Lvc/a;

    iget-object v1, v1, Lvc/a;->h:Lsc/f;

    invoke-virtual {v1}, Lsc/f;->e()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$a$a;->c(Ljava/lang/String;)Lxc/f0$e$a$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$a$a;->a()Lxc/f0$e$a;

    move-result-object v0

    return-object v0
.end method

.method private t(Ljava/lang/String;J)Lxc/f0$e;
    .locals 1

    invoke-static {}, Lxc/f0$e;->a()Lxc/f0$e$b;

    move-result-object v0

    invoke-virtual {v0, p2, p3}, Lxc/f0$e$b;->m(J)Lxc/f0$e$b;

    move-result-object p2

    invoke-virtual {p2, p1}, Lxc/f0$e$b;->j(Ljava/lang/String;)Lxc/f0$e$b;

    move-result-object p1

    sget-object p2, Lvc/t;->h:Ljava/lang/String;

    invoke-virtual {p1, p2}, Lxc/f0$e$b;->h(Ljava/lang/String;)Lxc/f0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->s()Lxc/f0$e$a;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$b;->b(Lxc/f0$e$a;)Lxc/f0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->v()Lxc/f0$e$e;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$b;->l(Lxc/f0$e$e;)Lxc/f0$e$b;

    move-result-object p1

    invoke-direct {p0}, Lvc/t;->u()Lxc/f0$e$c;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$b;->e(Lxc/f0$e$c;)Lxc/f0$e$b;

    move-result-object p1

    const/4 p2, 0x3

    invoke-virtual {p1, p2}, Lxc/f0$e$b;->i(I)Lxc/f0$e$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$b;->a()Lxc/f0$e;

    move-result-object p1

    return-object p1
.end method

.method private u()Lxc/f0$e$c;
    .locals 11

    new-instance v0, Landroid/os/StatFs;

    invoke-static {}, Landroid/os/Environment;->getDataDirectory()Ljava/io/File;

    move-result-object v1

    invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Landroid/os/StatFs;-><init>(Ljava/lang/String;)V

    invoke-static {}, Lvc/t;->g()I

    move-result v1

    invoke-static {}, Ljava/lang/Runtime;->getRuntime()Ljava/lang/Runtime;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Runtime;->availableProcessors()I

    move-result v2

    iget-object v3, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-static {v3}, Lvc/i;->b(Landroid/content/Context;)J

    move-result-wide v3

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockCount()I

    move-result v5

    int-to-long v5, v5

    invoke-virtual {v0}, Landroid/os/StatFs;->getBlockSize()I

    move-result v0

    int-to-long v7, v0

    mul-long/2addr v5, v7

    invoke-static {}, Lvc/i;->w()Z

    move-result v0

    invoke-static {}, Lvc/i;->l()I

    move-result v7

    sget-object v8, Landroid/os/Build;->MANUFACTURER:Ljava/lang/String;

    sget-object v9, Landroid/os/Build;->PRODUCT:Ljava/lang/String;

    invoke-static {}, Lxc/f0$e$c;->a()Lxc/f0$e$c$a;

    move-result-object v10

    invoke-virtual {v10, v1}, Lxc/f0$e$c$a;->b(I)Lxc/f0$e$c$a;

    move-result-object v1

    sget-object v10, Landroid/os/Build;->MODEL:Ljava/lang/String;

    invoke-virtual {v1, v10}, Lxc/f0$e$c$a;->f(Ljava/lang/String;)Lxc/f0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v2}, Lxc/f0$e$c$a;->c(I)Lxc/f0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v3, v4}, Lxc/f0$e$c$a;->h(J)Lxc/f0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v5, v6}, Lxc/f0$e$c$a;->d(J)Lxc/f0$e$c$a;

    move-result-object v1

    invoke-virtual {v1, v0}, Lxc/f0$e$c$a;->i(Z)Lxc/f0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v7}, Lxc/f0$e$c$a;->j(I)Lxc/f0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v8}, Lxc/f0$e$c$a;->e(Ljava/lang/String;)Lxc/f0$e$c$a;

    move-result-object v0

    invoke-virtual {v0, v9}, Lxc/f0$e$c$a;->g(Ljava/lang/String;)Lxc/f0$e$c$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$c$a;->a()Lxc/f0$e$c;

    move-result-object v0

    return-object v0
.end method

.method private v()Lxc/f0$e$e;
    .locals 2

    invoke-static {}, Lxc/f0$e$e;->a()Lxc/f0$e$e$a;

    move-result-object v0

    const/4 v1, 0x3

    invoke-virtual {v0, v1}, Lxc/f0$e$e$a;->d(I)Lxc/f0$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$e$a;->e(Ljava/lang/String;)Lxc/f0$e$e$a;

    move-result-object v0

    sget-object v1, Landroid/os/Build$VERSION;->CODENAME:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lxc/f0$e$e$a;->b(Ljava/lang/String;)Lxc/f0$e$e$a;

    move-result-object v0

    invoke-static {}, Lvc/i;->x()Z

    move-result v1

    invoke-virtual {v0, v1}, Lxc/f0$e$e$a;->c(Z)Lxc/f0$e$e$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$e$a;->a()Lxc/f0$e$e;

    move-result-object v0

    return-object v0
.end method

.method private w()Lxc/f0$e$d$a$b$d;
    .locals 3

    invoke-static {}, Lxc/f0$e$d$a$b$d;->a()Lxc/f0$e$d$a$b$d$a;

    move-result-object v0

    const-string v1, "0"

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$d$a;->d(Ljava/lang/String;)Lxc/f0$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0, v1}, Lxc/f0$e$d$a$b$d$a;->c(Ljava/lang/String;)Lxc/f0$e$d$a$b$d$a;

    move-result-object v0

    const-wide/16 v1, 0x0

    invoke-virtual {v0, v1, v2}, Lxc/f0$e$d$a$b$d$a;->b(J)Lxc/f0$e$d$a$b$d$a;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$d$a$b$d$a;->a()Lxc/f0$e$d$a$b$d;

    move-result-object v0

    return-object v0
.end method

.method private x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Lxc/f0$e$d$a$b$e;
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, p1, p2, v0}, Lvc/t;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lxc/f0$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lxc/f0$e$d$a$b$e;
    .locals 1

    invoke-static {}, Lxc/f0$e$d$a$b$e;->a()Lxc/f0$e$d$a$b$e$a;

    move-result-object v0

    invoke-virtual {p1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$e$d$a$b$e$a;->d(Ljava/lang/String;)Lxc/f0$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1, p3}, Lxc/f0$e$d$a$b$e$a;->c(I)Lxc/f0$e$d$a$b$e$a;

    move-result-object p1

    invoke-direct {p0, p2, p3}, Lvc/t;->r([Ljava/lang/StackTraceElement;I)Ljava/util/List;

    move-result-object p2

    invoke-virtual {p1, p2}, Lxc/f0$e$d$a$b$e$a;->b(Ljava/util/List;)Lxc/f0$e$d$a$b$e$a;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$a$b$e$a;->a()Lxc/f0$e$d$a$b$e;

    move-result-object p1

    return-object p1
.end method

.method private z(Ldd/e;Ljava/lang/Thread;IZ)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ldd/e;",
            "Ljava/lang/Thread;",
            "IZ)",
            "Ljava/util/List<",
            "Lxc/f0$e$d$a$b$e;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object p1, p1, Ldd/e;->c:[Ljava/lang/StackTraceElement;

    invoke-direct {p0, p2, p1, p3}, Lvc/t;->y(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;I)Lxc/f0$e$d$a$b$e;

    move-result-object p1

    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    if-eqz p4, :cond_1

    invoke-static {}, Ljava/lang/Thread;->getAllStackTraces()Ljava/util/Map;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map$Entry;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object p4

    check-cast p4, Ljava/lang/Thread;

    invoke-virtual {p4, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_0

    iget-object v1, p0, Lvc/t;->d:Ldd/d;

    invoke-interface {p3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, [Ljava/lang/StackTraceElement;

    invoke-interface {v1, p3}, Ldd/d;->a([Ljava/lang/StackTraceElement;)[Ljava/lang/StackTraceElement;

    move-result-object p3

    invoke-direct {p0, p4, p3}, Lvc/t;->x(Ljava/lang/Thread;[Ljava/lang/StackTraceElement;)Lxc/f0$e$d$a$b$e;

    move-result-object p3

    invoke-interface {v0, p3}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-static {v0}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public c(Lxc/f0$a;)Lxc/f0$e$d;
    .locals 4

    iget-object v0, p0, Lvc/t;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    invoke-static {}, Lxc/f0$e$d;->a()Lxc/f0$e$d$b;

    move-result-object v1

    const-string v2, "anr"

    invoke-virtual {v1, v2}, Lxc/f0$e$d$b;->g(Ljava/lang/String;)Lxc/f0$e$d$b;

    move-result-object v1

    invoke-virtual {p1}, Lxc/f0$a;->i()J

    move-result-wide v2

    invoke-virtual {v1, v2, v3}, Lxc/f0$e$d$b;->f(J)Lxc/f0$e$d$b;

    move-result-object v1

    invoke-direct {p0, p1}, Lvc/t;->a(Lxc/f0$a;)Lxc/f0$a;

    move-result-object p1

    invoke-direct {p0, v0, p1}, Lvc/t;->k(ILxc/f0$a;)Lxc/f0$e$d$a;

    move-result-object p1

    invoke-virtual {v1, p1}, Lxc/f0$e$d$b;->b(Lxc/f0$e$d$a;)Lxc/f0$e$d$b;

    move-result-object p1

    invoke-direct {p0, v0}, Lvc/t;->l(I)Lxc/f0$e$d$c;

    move-result-object v0

    invoke-virtual {p1, v0}, Lxc/f0$e$d$b;->c(Lxc/f0$e$d$c;)Lxc/f0$e$d$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$e$d$b;->a()Lxc/f0$e$d;

    move-result-object p1

    return-object p1
.end method

.method public d(Ljava/lang/Throwable;Ljava/lang/Thread;Ljava/lang/String;JIIZ)Lxc/f0$e$d;
    .locals 10

    move-object v7, p0

    iget-object v0, v7, Lvc/t;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v8, v0, Landroid/content/res/Configuration;->orientation:I

    iget-object v0, v7, Lvc/t;->d:Ldd/d;

    move-object v1, p1

    invoke-static {p1, v0}, Ldd/e;->a(Ljava/lang/Throwable;Ldd/d;)Ldd/e;

    move-result-object v2

    invoke-static {}, Lxc/f0$e$d;->a()Lxc/f0$e$d$b;

    move-result-object v0

    move-object v1, p3

    invoke-virtual {v0, p3}, Lxc/f0$e$d$b;->g(Ljava/lang/String;)Lxc/f0$e$d$b;

    move-result-object v0

    move-wide v3, p4

    invoke-virtual {v0, p4, p5}, Lxc/f0$e$d$b;->f(J)Lxc/f0$e$d$b;

    move-result-object v9

    move-object v0, p0

    move v1, v8

    move-object v3, p2

    move/from16 v4, p6

    move/from16 v5, p7

    move/from16 v6, p8

    invoke-direct/range {v0 .. v6}, Lvc/t;->j(ILdd/e;Ljava/lang/Thread;IIZ)Lxc/f0$e$d$a;

    move-result-object v0

    invoke-virtual {v9, v0}, Lxc/f0$e$d$b;->b(Lxc/f0$e$d$a;)Lxc/f0$e$d$b;

    move-result-object v0

    invoke-direct {p0, v8}, Lvc/t;->l(I)Lxc/f0$e$d$c;

    move-result-object v1

    invoke-virtual {v0, v1}, Lxc/f0$e$d$b;->c(Lxc/f0$e$d$c;)Lxc/f0$e$d$b;

    move-result-object v0

    invoke-virtual {v0}, Lxc/f0$e$d$b;->a()Lxc/f0$e$d;

    move-result-object v0

    return-object v0
.end method

.method public e(Ljava/lang/String;J)Lxc/f0;
    .locals 1

    invoke-direct {p0}, Lvc/t;->b()Lxc/f0$b;

    move-result-object v0

    invoke-direct {p0, p1, p2, p3}, Lvc/t;->t(Ljava/lang/String;J)Lxc/f0$e;

    move-result-object p1

    invoke-virtual {v0, p1}, Lxc/f0$b;->l(Lxc/f0$e;)Lxc/f0$b;

    move-result-object p1

    invoke-virtual {p1}, Lxc/f0$b;->a()Lxc/f0;

    move-result-object p1

    return-object p1
.end method