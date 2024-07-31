.class Lmd/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljd/g;


# instance fields
.field private a:Z

.field private b:Z

.field private c:Ljd/c;

.field private final d:Lmd/f;


# direct methods
.method constructor <init>(Lmd/f;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmd/i;->a:Z

    iput-boolean v0, p0, Lmd/i;->b:Z

    iput-object p1, p0, Lmd/i;->d:Lmd/f;

    return-void
.end method

.method private a()V
    .locals 2

    iget-boolean v0, p0, Lmd/i;->a:Z

    if-nez v0, :cond_0

    const/4 v0, 0x1

    iput-boolean v0, p0, Lmd/i;->a:Z

    return-void

    :cond_0
    new-instance v0, Ljd/b;

    const-string v1, "Cannot encode a second value in the ValueEncoderContext"

    invoke-direct {v0, v1}, Ljd/b;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public add(Ljava/lang/String;)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lmd/i;->a()V

    iget-object v0, p0, Lmd/i;->d:Lmd/f;

    iget-object v1, p0, Lmd/i;->c:Ljd/c;

    iget-boolean v2, p0, Lmd/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lmd/f;->d(Ljd/c;Ljava/lang/Object;Z)Ljd/e;

    return-object p0
.end method

.method public add(Z)Ljd/g;
    .locals 3

    invoke-direct {p0}, Lmd/i;->a()V

    iget-object v0, p0, Lmd/i;->d:Lmd/f;

    iget-object v1, p0, Lmd/i;->c:Ljd/c;

    iget-boolean v2, p0, Lmd/i;->b:Z

    invoke-virtual {v0, v1, p1, v2}, Lmd/f;->j(Ljd/c;ZZ)Lmd/f;

    return-object p0
.end method

.method b(Ljd/c;Z)V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lmd/i;->a:Z

    iput-object p1, p0, Lmd/i;->c:Ljd/c;

    iput-boolean p2, p0, Lmd/i;->b:Z

    return-void
.end method
