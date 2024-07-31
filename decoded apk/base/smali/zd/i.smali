.class public final synthetic Lzd/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljj/d;


# instance fields
.field public final synthetic a:Lzd/k;


# direct methods
.method public synthetic constructor <init>(Lzd/k;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/i;->a:Lzd/k;

    return-void
.end method


# virtual methods
.method public final accept(Ljava/lang/Object;)V
    .locals 1

    iget-object v0, p0, Lzd/i;->a:Lzd/k;

    check-cast p1, Ljava/lang/Throwable;

    invoke-static {v0, p1}, Lzd/k;->e(Lzd/k;Ljava/lang/Throwable;)V

    return-void
.end method
