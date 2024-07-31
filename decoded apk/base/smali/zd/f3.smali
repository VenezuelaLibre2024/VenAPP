.class public final synthetic Lzd/f3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/m3;


# direct methods
.method public synthetic constructor <init>(Lzd/m3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/f3;->a:Lzd/m3;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/f3;->a:Lzd/m3;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lzd/m3;->f(Lzd/m3;Ljava/lang/Throwable;)V

    return-void
.end method
