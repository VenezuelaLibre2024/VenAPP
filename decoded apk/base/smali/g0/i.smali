.class public final synthetic Lg0/i;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/u;

.field public final synthetic b:Lg0/u$b;


# direct methods
.method public synthetic constructor <init>(Lg0/u;Lg0/u$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/i;->a:Lg0/u;

    iput-object p2, p0, Lg0/i;->b:Lg0/u$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    iget-object v0, p0, Lg0/i;->a:Lg0/u;

    iget-object v1, p0, Lg0/i;->b:Lg0/u$b;

    invoke-static {v0, v1}, Lg0/u;->k(Lg0/u;Lg0/u$b;)V

    return-void
.end method
