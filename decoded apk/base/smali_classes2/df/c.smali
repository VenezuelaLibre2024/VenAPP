.class public final Ldf/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ldf/c$d;,
        Ldf/c$a;,
        Ldf/c$b;,
        Ldf/c$c;,
        Ldf/c$f;,
        Ldf/c$e;
    }
.end annotation


# static fields
.field public static final a:Lkd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ldf/c;

    invoke-direct {v0}, Ldf/c;-><init>()V

    sput-object v0, Ldf/c;->a:Lkd/a;

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

    const-class v0, Ldf/z;

    sget-object v1, Ldf/c$e;->a:Ldf/c$e;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Ldf/e0;

    sget-object v1, Ldf/c$f;->a:Ldf/c$f;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Ldf/e;

    sget-object v1, Ldf/c$c;->a:Ldf/c$c;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Ldf/b;

    sget-object v1, Ldf/c$b;->a:Ldf/c$b;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Ldf/a;

    sget-object v1, Ldf/c$a;->a:Ldf/c$a;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Ldf/t;

    sget-object v1, Ldf/c$d;->a:Ldf/c$d;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    return-void
.end method
