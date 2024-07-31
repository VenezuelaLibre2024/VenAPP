.class public final synthetic Lpc/l;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lpc/c0;

.field public final synthetic b:Lee/b;


# direct methods
.method public synthetic constructor <init>(Lpc/c0;Lee/b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lpc/l;->a:Lpc/c0;

    iput-object p2, p0, Lpc/l;->b:Lee/b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lpc/l;->a:Lpc/c0;

    iget-object v1, p0, Lpc/l;->b:Lee/b;

    invoke-static {v0, v1}, Lpc/n;->k(Lpc/c0;Lee/b;)V

    return-void
.end method
