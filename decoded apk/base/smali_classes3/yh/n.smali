.class public interface abstract Lyh/n;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static b(Ljava/lang/String;II)Lyh/n;
    .locals 1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    new-instance p1, Lyh/r;

    invoke-direct {p1, p0, p2}, Lyh/r;-><init>(Ljava/lang/String;I)V

    return-object p1

    :cond_0
    new-instance v0, Lyh/p;

    invoke-direct {v0, p0, p1, p2}, Lyh/p;-><init>(Ljava/lang/String;II)V

    return-object v0
.end method


# virtual methods
.method public abstract a(Lyh/k;)V
.end method

.method public c(Lyh/i;Ljava/lang/Runnable;)V
    .locals 1

    if-nez p1, :cond_0

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v0, Lyh/n$a;

    invoke-direct {v0, p0, p1}, Lyh/n$a;-><init>(Lyh/n;Lyh/i;)V

    move-object p1, v0

    :goto_0
    new-instance v0, Lyh/k;

    invoke-direct {v0, p1, p2}, Lyh/k;-><init>(Lyh/j;Ljava/lang/Runnable;)V

    invoke-interface {p0, v0}, Lyh/n;->a(Lyh/k;)V

    return-void
.end method

.method public abstract d()V
.end method

.method public abstract start()V
.end method
