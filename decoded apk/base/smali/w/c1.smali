.class public final synthetic Lw/c1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lw/i1;


# direct methods
.method public synthetic constructor <init>(Lw/i1;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lw/c1;->a:Lw/i1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lw/c1;->a:Lw/i1;

    invoke-static {v0}, Lw/i1;->e(Lw/i1;)V

    return-void
.end method
