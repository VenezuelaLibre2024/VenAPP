.class public final synthetic Lg0/e0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lg0/n0;

.field public final synthetic b:I

.field public final synthetic c:I


# direct methods
.method public synthetic constructor <init>(Lg0/n0;II)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg0/e0;->a:Lg0/n0;

    iput p2, p0, Lg0/e0;->b:I

    iput p3, p0, Lg0/e0;->c:I

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 3

    iget-object v0, p0, Lg0/e0;->a:Lg0/n0;

    iget v1, p0, Lg0/e0;->b:I

    iget v2, p0, Lg0/e0;->c:I

    invoke-static {v0, v1, v2}, Lg0/n0;->a(Lg0/n0;II)V

    return-void
.end method
