.class public Lvc/m;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lef/b;


# instance fields
.field private final a:Lvc/x;

.field private final b:Lvc/l;


# direct methods
.method public constructor <init>(Lvc/x;Lad/f;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lvc/m;->a:Lvc/x;

    new-instance p1, Lvc/l;

    invoke-direct {p1, p2}, Lvc/l;-><init>(Lad/f;)V

    iput-object p1, p0, Lvc/m;->b:Lvc/l;

    return-void
.end method


# virtual methods
.method public a()Z
    .locals 1

    iget-object v0, p0, Lvc/m;->a:Lvc/x;

    invoke-virtual {v0}, Lvc/x;->d()Z

    move-result v0

    return v0
.end method

.method public b(Lef/b$b;)V
    .locals 3

    invoke-static {}, Lsc/g;->f()Lsc/g;

    move-result-object v0

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "App Quality Sessions session changed: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lsc/g;->b(Ljava/lang/String;)V

    iget-object v0, p0, Lvc/m;->b:Lvc/l;

    invoke-virtual {p1}, Lef/b$b;->a()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lvc/l;->h(Ljava/lang/String;)V

    return-void
.end method

.method public c()Lef/b$a;
    .locals 1

    sget-object v0, Lef/b$a;->CRASHLYTICS:Lef/b$a;

    return-object v0
.end method

.method public d(Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lvc/m;->b:Lvc/l;

    invoke-virtual {v0, p1}, Lvc/l;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lvc/m;->b:Lvc/l;

    invoke-virtual {v0, p1}, Lvc/l;->i(Ljava/lang/String;)V

    return-void
.end method
