.class public final synthetic Lg0/n;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/u;


# direct methods
.method public synthetic constructor <init>(Lg0/u;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/n;->a:Lg0/u;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lg0/n;->a:Lg0/u;

    invoke-static {v0}, Lg0/u;->o(Lg0/u;)V

    return-void
.end method
