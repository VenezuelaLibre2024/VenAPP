.class public final synthetic Ly8/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly8/b;

.field public final synthetic b:Ly8/a;


# direct methods
.method public synthetic constructor <init>(Ly8/b;Ly8/a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly8/g;->a:Ly8/b;

    iput-object p2, p0, Ly8/g;->b:Ly8/a;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Ly8/g;->a:Ly8/b;

    iget-object v1, p0, Ly8/g;->b:Ly8/a;

    invoke-virtual {v0, v1}, Ly8/b;->f(Ly8/a;)V

    return-void
.end method
