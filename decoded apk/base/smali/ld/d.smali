.class public final Lld/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/b;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lld/d$b;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lkd/b<",
        "Lld/d;",
        ">;"
    }
.end annotation


# static fields
.field private static final e:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private static final f:Ljd/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/f<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static final g:Ljd/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/f<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation
.end field

.field private static final h:Lld/d$b;


# instance fields
.field private final a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/d<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final b:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/Class<",
            "*>;",
            "Ljd/f<",
            "*>;>;"
        }
    .end annotation
.end field

.field private c:Ljd/d;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljd/d<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field private d:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lld/a;

    invoke-direct {v0}, Lld/a;-><init>()V

    sput-object v0, Lld/d;->e:Ljd/d;

    new-instance v0, Lld/b;

    invoke-direct {v0}, Lld/b;-><init>()V

    sput-object v0, Lld/d;->f:Ljd/f;

    new-instance v0, Lld/c;

    invoke-direct {v0}, Lld/c;-><init>()V

    sput-object v0, Lld/d;->g:Ljd/f;

    new-instance v0, Lld/d$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lld/d$b;-><init>(Lld/d$a;)V

    sput-object v0, Lld/d;->h:Lld/d$b;

    return-void
.end method

.method public constructor <init>()V
    .locals 2

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lld/d;->a:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lld/d;->b:Ljava/util/Map;

    sget-object v0, Lld/d;->e:Ljd/d;

    iput-object v0, p0, Lld/d;->c:Ljd/d;

    const/4 v0, 0x0

    iput-boolean v0, p0, Lld/d;->d:Z

    const-class v0, Ljava/lang/String;

    sget-object v1, Lld/d;->f:Ljd/f;

    invoke-virtual {p0, v0, v1}, Lld/d;->o(Ljava/lang/Class;Ljd/f;)Lld/d;

    const-class v0, Ljava/lang/Boolean;

    sget-object v1, Lld/d;->g:Ljd/f;

    invoke-virtual {p0, v0, v1}, Lld/d;->o(Ljava/lang/Class;Ljd/f;)Lld/d;

    const-class v0, Ljava/util/Date;

    sget-object v1, Lld/d;->h:Lld/d$b;

    invoke-virtual {p0, v0, v1}, Lld/d;->o(Ljava/lang/Class;Ljd/f;)Lld/d;

    return-void
.end method

.method public static synthetic a(Ljava/lang/Object;Ljd/e;)V
    .locals 0

    invoke-static {p0, p1}, Lld/d;->k(Ljava/lang/Object;Ljd/e;)V

    return-void
.end method

.method public static synthetic b(Ljava/lang/String;Ljd/g;)V
    .locals 0

    invoke-static {p0, p1}, Lld/d;->l(Ljava/lang/String;Ljd/g;)V

    return-void
.end method

.method public static synthetic c(Ljava/lang/Boolean;Ljd/g;)V
    .locals 0

    invoke-static {p0, p1}, Lld/d;->m(Ljava/lang/Boolean;Ljd/g;)V

    return-void
.end method

.method static synthetic d(Lld/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lld/d;->a:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic e(Lld/d;)Ljava/util/Map;
    .locals 0

    iget-object p0, p0, Lld/d;->b:Ljava/util/Map;

    return-object p0
.end method

.method static synthetic f(Lld/d;)Ljd/d;
    .locals 0

    iget-object p0, p0, Lld/d;->c:Ljd/d;

    return-object p0
.end method

.method static synthetic g(Lld/d;)Z
    .locals 0

    iget-boolean p0, p0, Lld/d;->d:Z

    return p0
.end method

.method private static synthetic k(Ljava/lang/Object;Ljd/e;)V
    .locals 2

    new-instance p1, Ljd/b;

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Couldn\'t find encoder for type "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Class;->getCanonicalName()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {p1, p0}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private static synthetic l(Ljava/lang/String;Ljd/g;)V
    .locals 0

    invoke-interface {p1, p0}, Ljd/g;->add(Ljava/lang/String;)Ljd/g;

    return-void
.end method

.method private static synthetic m(Ljava/lang/Boolean;Ljd/g;)V
    .locals 0

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    invoke-interface {p1, p0}, Ljd/g;->add(Z)Ljd/g;

    return-void
.end method


# virtual methods
.method public h()Ljd/a;
    .locals 1

    new-instance v0, Lld/d$a;

    invoke-direct {v0, p0}, Lld/d$a;-><init>(Lld/d;)V

    return-object v0
.end method

.method public i(Lkd/a;)Lld/d;
    .locals 0

    invoke-interface {p1, p0}, Lkd/a;->configure(Lkd/b;)V

    return-object p0
.end method

.method public j(Z)Lld/d;
    .locals 0

    iput-boolean p1, p0, Lld/d;->d:Z

    return-object p0
.end method

.method public n(Ljava/lang/Class;Ljd/d;)Lld/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljd/d<",
            "-TT;>;)",
            "Lld/d;"
        }
    .end annotation

    iget-object v0, p0, Lld/d;->a:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lld/d;->b:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public o(Ljava/lang/Class;Ljd/f;)Lld/d;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Ljava/lang/Class<",
            "TT;>;",
            "Ljd/f<",
            "-TT;>;)",
            "Lld/d;"
        }
    .end annotation

    iget-object v0, p0, Lld/d;->b:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object p2, p0, Lld/d;->a:Ljava/util/Map;

    invoke-interface {p2, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public bridge synthetic registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lld/d;->n(Ljava/lang/Class;Ljd/d;)Lld/d;

    move-result-object p1

    return-object p1
.end method
