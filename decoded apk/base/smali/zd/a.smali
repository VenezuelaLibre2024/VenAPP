.class public final synthetic Lzd/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lzd/b;

.field public final synthetic b:Lqd/m;


# direct methods
.method public synthetic constructor <init>(Lzd/b;Lqd/m;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzd/a;->a:Lzd/b;

    iput-object p2, p0, Lzd/a;->b:Lqd/m;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lzd/a;->a:Lzd/b;

    iget-object v1, p0, Lzd/a;->b:Lqd/m;

    invoke-static {v0, v1}, Lzd/b;->a(Lzd/b;Lqd/m;)V

    return-void
.end method
