.class public final Lg6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lg6/b$f;,
        Lg6/b$d;,
        Lg6/b$a;,
        Lg6/b$c;,
        Lg6/b$e;,
        Lg6/b$b;
    }
.end annotation


# static fields
.field public static final a:Lkd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lg6/b;

    invoke-direct {v0}, Lg6/b;-><init>()V

    sput-object v0, Lg6/b;->a:Lkd/a;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public configure(Lkd/b;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkd/b<",
            "*>;)V"
        }
    .end annotation

    sget-object v0, Lg6/b$b;->a:Lg6/b$b;

    const-class v1, Lg6/j;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/d;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    sget-object v0, Lg6/b$e;->a:Lg6/b$e;

    const-class v1, Lg6/m;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/g;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    sget-object v0, Lg6/b$c;->a:Lg6/b$c;

    const-class v1, Lg6/k;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/e;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    sget-object v0, Lg6/b$a;->a:Lg6/b$a;

    const-class v1, Lg6/a;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/c;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    sget-object v0, Lg6/b$d;->a:Lg6/b$d;

    const-class v1, Lg6/l;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/f;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    sget-object v0, Lg6/b$f;->a:Lg6/b$f;

    const-class v1, Lg6/o;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v1, Lg6/i;

    invoke-interface {p1, v1, v0}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    return-void
.end method
