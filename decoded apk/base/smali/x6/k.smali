.class public final synthetic Lx6/k;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lx6/g;


# direct methods
.method public synthetic constructor <init>(Lx6/g;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lx6/k;->a:Lx6/g;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lx6/k;->a:Lx6/g;

    invoke-static {v0}, Lx6/h$h;->c(Lx6/g;)V

    return-void
.end method
