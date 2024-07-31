.class public final synthetic Lw/d1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw/i1$i;

.field public final synthetic b:Lw/i1$h;


# direct methods
.method public synthetic constructor <init>(Lw/i1$i;Lw/i1$h;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/d1;->a:Lw/i1$i;

    iput-object p2, p0, Lw/d1;->b:Lw/i1$h;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lw/d1;->a:Lw/i1$i;

    iget-object v1, p0, Lw/d1;->b:Lw/i1$h;

    invoke-static {v0, v1}, Lw/i1;->b(Lw/i1$i;Lw/i1$h;)V

    return-void
.end method
