.class public final Lme/b$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lme/b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field private a:Lme/a;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lme/b$a;->a:Lme/a;

    return-void
.end method


# virtual methods
.method public a()Lme/b;
    .locals 2

    new-instance v0, Lme/b;

    iget-object v1, p0, Lme/b$a;->a:Lme/a;

    invoke-direct {v0, v1}, Lme/b;-><init>(Lme/a;)V

    return-object v0
.end method

.method public b(Lme/a;)Lme/b$a;
    .locals 0

    iput-object p1, p0, Lme/b$a;->a:Lme/a;

    return-object p0
.end method
