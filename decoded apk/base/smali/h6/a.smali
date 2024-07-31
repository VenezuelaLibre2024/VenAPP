.class public final Lh6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lkd/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lh6/a$f;,
        Lh6/a$b;,
        Lh6/a$c;,
        Lh6/a$d;,
        Lh6/a$g;,
        Lh6/a$a;,
        Lh6/a$e;
    }
.end annotation


# static fields
.field public static final a:Lkd/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lh6/a;

    invoke-direct {v0}, Lh6/a;-><init>()V

    sput-object v0, Lh6/a;->a:Lkd/a;

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

    const-class v0, Lh6/m;

    sget-object v1, Lh6/a$e;->a:Lh6/a$e;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/a;

    sget-object v1, Lh6/a$a;->a:Lh6/a$a;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/f;

    sget-object v1, Lh6/a$g;->a:Lh6/a$g;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/d;

    sget-object v1, Lh6/a$d;->a:Lh6/a$d;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/c;

    sget-object v1, Lh6/a$c;->a:Lh6/a$c;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/b;

    sget-object v1, Lh6/a$b;->a:Lh6/a$b;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    const-class v0, Lk6/e;

    sget-object v1, Lh6/a$f;->a:Lh6/a$f;

    invoke-interface {p1, v0, v1}, Lkd/b;->registerEncoder(Ljava/lang/Class;Ljd/d;)Lkd/b;

    return-void
.end method
