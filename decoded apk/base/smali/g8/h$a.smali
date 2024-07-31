.class Lg8/h$a;
.super Lg8/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/h;->x()Lg8/o;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Lg8/h;


# direct methods
.method constructor <init>(Lg8/h;)V
    .locals 0

    iput-object p1, p0, Lg8/h$a;->f:Lg8/h;

    invoke-direct {p0}, Lg8/o;-><init>()V

    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    iget-object v0, p0, Lg8/h$a;->f:Lg8/h;

    invoke-static {v0, p0}, Lg8/h;->v(Lg8/h;Lw6/h;)V

    return-void
.end method
