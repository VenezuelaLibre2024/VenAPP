.class public final Ll9/e;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private a:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method static bridge synthetic c(Ll9/e;)Ljava/lang/String;
    .locals 0

    iget-object p0, p0, Ll9/e;->a:Ljava/lang/String;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/String;)Ll9/e;
    .locals 0

    iput-object p1, p0, Ll9/e;->a:Ljava/lang/String;

    return-object p0
.end method

.method public final b()Ll9/g;
    .locals 2

    new-instance v0, Ll9/g;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Ll9/g;-><init>(Ll9/e;Ll9/f;)V

    return-object v0
.end method
