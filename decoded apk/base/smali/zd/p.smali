.class public final synthetic Lzd/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/s$e;

.field public final synthetic b:Lde/i;


# direct methods
.method public synthetic constructor <init>(Lzd/s$e;Lde/i;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/p;->a:Lzd/s$e;

    iput-object p2, p0, Lzd/p;->b:Lde/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/p;->a:Lzd/s$e;

    iget-object v1, p0, Lzd/p;->b:Lde/i;

    invoke-static {v0, v1}, Lzd/s;->c(Lzd/s$e;Lde/i;)V

    return-void
.end method
