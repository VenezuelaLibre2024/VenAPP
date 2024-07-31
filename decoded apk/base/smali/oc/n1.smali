.class final Loc/n1;
.super Loc/j1;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    invoke-direct {p0}, Loc/j1;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Loc/g1;
    .locals 4

    new-instance v0, Loc/k1;

    iget-object v1, p0, Loc/n1;->a:Ljava/lang/String;

    iget-object v2, p0, Loc/n1;->b:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3, v3}, Loc/k1;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Loc/m1;)V

    return-object v0
.end method

.method public final b(Ljava/lang/String;)Loc/j1;
    .locals 0

    iput-object p1, p0, Loc/n1;->b:Ljava/lang/String;

    return-object p0
.end method

.method public final c(Ljava/lang/String;)Loc/j1;
    .locals 0

    iput-object p1, p0, Loc/n1;->a:Ljava/lang/String;

    return-object p0
.end method
