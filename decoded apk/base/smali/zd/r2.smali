.class public Lzd/r2;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lzd/r2$a;
    }
.end annotation


# instance fields
.field private a:Lzd/r2$a;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lzd/r2$a;)V
    .locals 0

    iput-object p1, p0, Lzd/r2;->a:Lzd/r2$a;

    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Programmatically trigger: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lzd/l2;->a(Ljava/lang/String;)V

    iget-object v0, p0, Lzd/r2;->a:Lzd/r2$a;

    invoke-interface {v0, p1}, Lzd/r2$a;->a(Ljava/lang/String;)V

    return-void
.end method
