.class public final synthetic Ly/o0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Ly/r0;


# direct methods
.method public synthetic constructor <init>(Ly/r0;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly/o0;->a:Ly/r0;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Ly/o0;->a:Ly/r0;

    invoke-static {v0}, Ly/r0;->d(Ly/r0;)V

    return-void
.end method
