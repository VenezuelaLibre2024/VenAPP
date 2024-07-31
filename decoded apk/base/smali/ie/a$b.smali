.class final Lie/a$b;
.super Lie/d$a;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lie/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "b"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private d:Lie/f;

.field private e:Lie/d$b;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Lie/d$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a()Lie/d;
    .locals 8

    new-instance v7, Lie/a;

    iget-object v1, p0, Lie/a$b;->a:Ljava/lang/String;

    iget-object v2, p0, Lie/a$b;->b:Ljava/lang/String;

    iget-object v3, p0, Lie/a$b;->c:Ljava/lang/String;

    iget-object v4, p0, Lie/a$b;->d:Lie/f;

    iget-object v5, p0, Lie/a$b;->e:Lie/d$b;

    const/4 v6, 0x0

    move-object v0, v7

    invoke-direct/range {v0 .. v6}, Lie/a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lie/f;Lie/d$b;Lie/a$a;)V

    return-object v7
.end method

.method public b(Lie/f;)Lie/d$a;
    .locals 0

    iput-object p1, p0, Lie/a$b;->d:Lie/f;

    return-object p0
.end method

.method public c(Ljava/lang/String;)Lie/d$a;
    .locals 0

    iput-object p1, p0, Lie/a$b;->b:Ljava/lang/String;

    return-object p0
.end method

.method public d(Ljava/lang/String;)Lie/d$a;
    .locals 0

    iput-object p1, p0, Lie/a$b;->c:Ljava/lang/String;

    return-object p0
.end method

.method public e(Lie/d$b;)Lie/d$a;
    .locals 0

    iput-object p1, p0, Lie/a$b;->e:Lie/d$b;

    return-object p0
.end method

.method public f(Ljava/lang/String;)Lie/d$a;
    .locals 0

    iput-object p1, p0, Lie/a$b;->a:Ljava/lang/String;

    return-object p0
.end method
