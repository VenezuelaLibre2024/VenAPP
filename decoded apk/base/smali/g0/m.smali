.class public final synthetic Lg0/m;
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

    iput-object p1, p0, Lg0/m;->a:Lw/i1;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/m;->a:Lw/i1;

    invoke-virtual {v0}, Lw/i1;->y()Z

    return-void
.end method
