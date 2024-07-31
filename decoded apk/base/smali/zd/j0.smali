.class public final synthetic Lzd/j0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/k0;


# direct methods
.method public synthetic constructor <init>(Lzd/k0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/j0;->a:Lzd/k0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lzd/j0;->a:Lzd/k0;

    invoke-static {v0}, Lzd/k0;->a(Lzd/k0;)V

    return-void
.end method
