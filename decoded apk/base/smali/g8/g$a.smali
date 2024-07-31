.class Lg8/g$a;
.super Lg8/o;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lg8/g;-><init>()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic f:Lg8/g;


# direct methods
.method constructor <init>(Lg8/g;)V
    .locals 0

    iput-object p1, p0, Lg8/g$a;->f:Lg8/g;

    invoke-direct {p0}, Lg8/o;-><init>()V

    return-void
.end method


# virtual methods
.method public x()V
    .locals 1

    iget-object v0, p0, Lg8/g$a;->f:Lg8/g;

    invoke-static {v0, p0}, Lg8/g;->e(Lg8/g;Lg8/o;)V

    return-void
.end method
